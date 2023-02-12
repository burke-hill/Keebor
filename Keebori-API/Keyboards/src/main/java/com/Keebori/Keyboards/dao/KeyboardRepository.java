package com.Keebori.Keyboards.dao;

import com.Keebori.Keyboards.model.Keyboard;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface KeyboardRepository extends CrudRepository<Keyboard, Keyboard> {
    Optional<Keyboard> findById(Long id);
}
