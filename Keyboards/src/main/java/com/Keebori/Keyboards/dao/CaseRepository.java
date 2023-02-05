package com.Keebori.Keyboards.dao;

import com.Keebori.Keyboards.model.Case;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<Case, Case> {


    Case findByName(String name);
}
