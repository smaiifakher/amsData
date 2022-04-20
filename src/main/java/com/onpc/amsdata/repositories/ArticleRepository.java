package com.onpc.amsdata.repositories;

import com.onpc.amsdata.entities.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
