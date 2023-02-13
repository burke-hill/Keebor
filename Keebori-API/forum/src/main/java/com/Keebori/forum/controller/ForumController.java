package com.Keebori.forum.controller;

import com.Keebori.Keyboards.model.Keyboard;
import com.Keebori.Keyboards.service.KeyboardService;
import com.Keebori.forum.model.ForumEntry;
import com.Keebori.forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping(path="/forum")
public class ForumController {

    @Autowired
    private final ForumService forumService;

    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<ForumEntry> getAllEntries()
    {
        return forumService.getAllEntries();
    }

    @GetMapping(path="/testAdd")
    public @ResponseBody void test()
    {
        forumService.addKeyboardTest();
    }



}
