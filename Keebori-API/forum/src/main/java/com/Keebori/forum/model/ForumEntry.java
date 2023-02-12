package com.Keebori.forum.model;

import com.Keebori.Keyboards.model.Keyboard;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="forum_posts")
public class ForumEntry {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private String content;
    private Keyboard associatedKeyboard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Keyboard getAssociatedKeyboard() {
        return associatedKeyboard;
    }

    public void setAssociatedKeyboard(Keyboard associatedKeyboard) {
        this.associatedKeyboard = associatedKeyboard;
    }
}
