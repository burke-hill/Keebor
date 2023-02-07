package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.CaseRepository;
import com.Keebori.Keyboards.model.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    public Case findCase(String name)
    {
        return caseRepository.findByName(name);
    }
}
