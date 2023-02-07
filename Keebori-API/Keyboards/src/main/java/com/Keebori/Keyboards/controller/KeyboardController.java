package com.Keebori.Keyboards.controller;


import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Keyboard;
import com.Keebori.Keyboards.service.CaseService;
import com.Keebori.Keyboards.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path="/keyboards")
public class KeyboardController
{
    private final KeyboardService keyboardService;
    private final CaseService caseService;

    @Autowired
    public KeyboardController(KeyboardService keyboardService, CaseService caseService)
    {
        this.caseService = caseService;
        this.keyboardService = keyboardService;
    }


    @GetMapping(path="/test")
    public void helloWorld() throws IOException
    {
        keyboardService.testKeyboard();
    }
}
