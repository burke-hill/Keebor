package com.Keebori.Keyboards.dao;

import com.Keebori.Keyboards.model.Keyboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KeyboardRepository extends CrudRepository<Keyboard, Keyboard> {

    Keyboard findByBuildname(String name);
    Keyboard findById(long l);
}
