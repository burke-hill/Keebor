package com.Keebori.Keyboards.dao;

import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Pcb;
import org.springframework.data.repository.CrudRepository;

public interface PcbRepository extends CrudRepository<Pcb, String> {
}
