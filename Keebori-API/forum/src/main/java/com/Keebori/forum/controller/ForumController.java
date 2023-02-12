package com.Keebori.forum.controller;

import com.Keebori.forum.model.ForumEntry;
import com.Keebori.forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/test")
    public @ResponseBody String test()
    {
        return "Hello :)";
    }



}
