package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.CaseRepository;
import com.Keebori.Keyboards.dao.KeyboardRepository;
import com.Keebori.Keyboards.model.Keyboard;
import com.Keebori.Keyboards.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyboardService {

    private final CaseService caseService;
    @Autowired
    private KeyboardRepository keyboardRepository;
    public KeyboardService(CaseService caseService)
    {
        this.caseService = caseService;
    }


    public void testKeyboard()
    {
        Keyboard testKeeb = new Keyboard();
        testKeeb.setCaseChoice(caseService.findCase("Test Case"));
        keyboardRepository.save(testKeeb);
    }

    /*public Keyboard buildKeyboard()
    {
        Keyboard ret = new Keyboard();
        ret.setCaseChoice(caseService.findCase("Test Case"));
        return ret;
    }*/

}
