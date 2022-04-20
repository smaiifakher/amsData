package com.onpc.amsdata.repositories;

import com.onpc.amsdata.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
