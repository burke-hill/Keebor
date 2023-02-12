package com.Keebori.Keyboards.service;

import com.Keebori.Keyboards.dao.PcbRepository;
import com.Keebori.Keyboards.model.Case;
import com.Keebori.Keyboards.model.Pcb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PcbService
{
    @Autowired
    private PcbRepository pcbRepository;

    public Pcb findPcb(String name)
    {
        return pcbRepository.findByName(name);
    }

    public void savePcb(Pcb pcbTest)
    {
        pcbRepository.save(pcbTest);
    }
}
