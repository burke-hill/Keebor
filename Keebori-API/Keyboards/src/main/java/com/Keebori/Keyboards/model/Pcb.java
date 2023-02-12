package com.Keebori.Keyboards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pcbs")
public class Pcb {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean hotswap;
    private Integer size;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHotswap() {
        return hotswap;
    }

    public void setHotswap(boolean hotswap) {
        this.hotswap = hotswap;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
