package com.Keebori.forum.dao;

import com.Keebori.forum.model.ForumEntry;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface ForumRepository extends CrudRepository<ForumEntry, Id> {
    ForumEntry findByTitle(String title);
}
