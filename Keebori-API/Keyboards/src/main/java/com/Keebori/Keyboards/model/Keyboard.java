package com.Keebori.Keyboards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "keyboards")
public class Keyboard {

    // fields for keyboard class
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Case caseChoice;

    @ManyToOne
    private Switch switchChoice;

    @ManyToOne
    private Pcb pcbChoice;

    @ManyToOne
    private Keycaps keycapChoice;

    private String buildname;

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Case getCaseChoice() {
        return caseChoice;
    }

    public void setCaseChoice(Case caseChoice) {
        this.caseChoice = caseChoice;
    }

    public Switch getSwitchChoice() {
        return switchChoice;
    }

    public void setSwitchChoice(Switch switchChoice) {
        this.switchChoice = switchChoice;
    }

    public Pcb getPcbChoice() {
        return pcbChoice;
    }

    public void setPcbChoice(Pcb pcbChoice) {
        this.pcbChoice = pcbChoice;
    }

    public Keycaps getKeycapChoice() {
        return keycapChoice;
    }

    public void setKeycapChoice(Keycaps keycapChoice) {
        this.keycapChoice = keycapChoice;
    }
}
