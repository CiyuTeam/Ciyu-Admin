package com.company.ciyu.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "PHONETIC", indexes = {
        @Index(name = "IDX_PHONETIC_WORD_ID", columnList = "WORD_ID")
})
@Entity
public class Phonetic {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "LOCALE")
    private String locale;

    @Column(name = "SYMBOL")
    private String symbol;

    @Column(name = "AUDIO")
    private String audio;
    @JoinColumn(name = "WORD_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Word word;

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}