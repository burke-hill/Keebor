package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.CaseRepository;
import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Keyboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyboardService {

    private final CaseService caseService;
    @Autowired
    public KeyboardService(CaseService caseService)
    {
        this.caseService = caseService;
    }



    /*public Keyboard buildKeyboard()
    {
        Keyboard ret = new Keyboard();
        ret.setCaseChoice(caseService.findCase("Test Case"));
        return ret;
    }*/

}
