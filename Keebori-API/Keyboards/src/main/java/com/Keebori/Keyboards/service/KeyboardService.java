package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.KeyboardRepository;
import com.Keebori.Keyboards.model.Keyboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KeyboardService {

    private final CaseService caseService;
    private final KeycapsService keycapsService;
    private final PcbService pcbService;
    private final SwitchService switchService;
    @Autowired
    private KeyboardRepository keyboardRepository;
    public KeyboardService(CaseService caseService, KeycapsService keycapsService, PcbService pcbService, SwitchService switchService)
    {
        this.caseService = caseService;
        this.keycapsService = keycapsService;
        this.pcbService = pcbService;
        this.switchService = switchService;
    }


    public void testKeyboard()
    {
        Keyboard testKeeb = new Keyboard();
        testKeeb.setCaseChoice(caseService.findCase("Test Case"));
        testKeeb.setKeycapChoice(keycapsService.findKeycaps("Test Keycaps"));
        testKeeb.setPcbChoice(pcbService.findPcb("Test Pcb"));
        testKeeb.setSwitchChoice(switchService.findSwitch("Test Switch"));
        testKeeb.setUsername("Test User");
        keyboardRepository.save(testKeeb);
    }

    public Iterable<Keyboard> findAllKeyboards()
    {
        return keyboardRepository.findAll();
    }



    /*public Keyboard buildKeyboard()
    {
        Keyboard ret = new Keyboard();
        ret.setCaseChoice(caseService.findCase("Test Case"));
        return ret;
    }*/

}
