package com.onpc.amsdata.controllers;


import com.onpc.amsdata.entities.Message;
import com.onpc.amsdata.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/message/")
public class MessageController {

    protected final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @GetMapping("list")
    public String listMessages(Model model) {
        List<Message> messages = (List<Message>) messageRepository.findAll();
        if (messages.size() == 0) {
            messages = null;
        }
        model.addAttribute("messages", messages);
        return "message/list";
    }

    @GetMapping("add")
    public String showAddMessageForm(Model model) {

        model.addAttribute("message", new Message());
        return "message/add";
    }

    @PostMapping("add")
    //@ResponseBody
    public String addMessage(@Valid Message message, BindingResult result) {

        if (result.hasErrors()) {
            return "message/add";
        }
        messageRepository.save(message);
        return "redirect:list";

    }


}
