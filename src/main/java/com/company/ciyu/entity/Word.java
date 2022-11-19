package com.company.ciyu.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;

@JmixEntity
@Table(name = "WORD")
@Entity
public class Word {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false, length = 36)
    @Id
    private String id;

    @Composition
    @OneToMany(mappedBy = "word")
    private List<Sentence> sentences;

    @Column(name = "CONTENT")
    private String content;

    @Composition
    @OneToMany(mappedBy = "word")
    private List<Meaning> meanings;

    @Composition
    @OneToMany(mappedBy = "word")
    private List<Phonetic> phonetics;

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Phonetic> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<Phonetic> phonetics) {
        this.phonetics = phonetics;
    }

    public List<Meaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String word) {
        this.content = word;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}