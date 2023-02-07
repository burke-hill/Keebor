package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.service.CaseService;
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
