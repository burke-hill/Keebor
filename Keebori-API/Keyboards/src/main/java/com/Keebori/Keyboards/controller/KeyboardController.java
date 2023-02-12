package com.Keebori.Keyboards.controller;


import com.Keebori.Keyboards.model.Keyboard;
import com.Keebori.Keyboards.service.CaseService;
import com.Keebori.Keyboards.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Keyboard> findKeyboard() throws IOException
    {
        return keyboardService.findAllKeyboards();
    }

    @GetMapping(path="/{buildname}")
    public @ResponseBody Keyboard getKeyboard(@PathVariable("buildname") String buildname)
    {
        return keyboardService.getKeyboard(buildname);
    }

}
