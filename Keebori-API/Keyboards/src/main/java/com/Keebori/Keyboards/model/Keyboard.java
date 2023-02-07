package com.Keebori.Keyboards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "keyboards")
public class Keyboard {

    // fields for keyboard class
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Case caseChoice;

    @OneToOne(cascade = CascadeType.ALL)
    private Switch switchChoice;

    @OneToOne(cascade = CascadeType.ALL)
    private Pcb pcbChoice;

    @OneToOne(cascade = CascadeType.ALL)
    private Keycaps keycapChoice;

    @Column(unique=true)
    private String Username;

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
