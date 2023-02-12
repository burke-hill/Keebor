package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.CaseRepository;
import com.Keebori.Keyboards.dao.KeycapsRepository;
import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Keycaps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeycapsService
{
    @Autowired
    private KeycapsRepository keycapsRepository;

    public Keycaps findKeycaps(String name)
    {
        return keycapsRepository.findByName(name);
    }

    public void saveKeycaps(Keycaps keycaps)
    {
        keycapsRepository.save(keycaps);
    }
}
