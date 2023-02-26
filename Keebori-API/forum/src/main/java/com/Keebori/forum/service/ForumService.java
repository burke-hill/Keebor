package com.Keebori.forum.service;

import com.Keebori.Keyboards.model.Keyboard;
import com.Keebori.Keyboards.service.KeyboardService;
import com.Keebori.forum.dao.ForumRepository;
import com.Keebori.forum.model.ForumEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ForumService {

    @Autowired
    private final ForumRepository forumRepository;
    private final KeyboardService keyboardService;

    public ForumService(ForumRepository forumRepository, KeyboardService keyboardService)
    {
        this.forumRepository = forumRepository;
        this.keyboardService = keyboardService;
    }


    public Iterable<ForumEntry> getAllEntries()
    {
        return forumRepository.findAll();
    }

    public void addKeyboardTest()
    {
        ForumEntry newEntry = new ForumEntry();
        newEntry.setDate(LocalDate.now());
        newEntry.setTitle("Test Title");
        newEntry.setContent("HEY THERE HEY THEREHEY THEREHEY THEREHEY THEREHEY THEREHEY THEREHEY THEREHEY THEREHEY THEREHEY THERE");
        newEntry.setAssociatedKeyboard(keyboardService.getKeyboard("Test Build"));
        forumRepository.save(newEntry);
    }

    public ForumEntry saveNewEntry(ForumEntry entry)
    {
        return forumRepository.save(entry);
    }


}
