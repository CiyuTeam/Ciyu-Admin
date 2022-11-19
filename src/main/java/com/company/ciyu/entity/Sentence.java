package com.company.ciyu.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "SENTENCE", indexes = {
        @Index(name = "IDX_SENTENCE_WORD_ID", columnList = "WORD_ID")
})
@Entity
public class Sentence {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CONTENT", length = 1023)
    private String content;

    @Column(name = "TRANSLATION")
    private String translation;

    @Column(name = "SOURCE")
    private String source;

    @JoinColumn(name = "WORD_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Word word;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}