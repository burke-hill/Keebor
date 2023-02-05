package com.Keebori.Keyboards.dao;

import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Keycaps;
import org.springframework.data.repository.CrudRepository;

public interface KeycapsRepository extends CrudRepository<Keycaps, String> {
}
