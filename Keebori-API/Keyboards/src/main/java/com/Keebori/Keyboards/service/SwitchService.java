package com.Keebori.Keyboards.service;


import com.Keebori.Keyboards.dao.SwitchRepository;
import com.Keebori.Keyboards.model.Switch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwitchService
{
    @Autowired
    private SwitchRepository switchRepository;

    public Switch findSwitch(String name)
    {
        return switchRepository.findByName(name);
    }

    public void saveSwitch(Switch switchTest)
    {
        switchRepository.save(switchTest);
    }
}
