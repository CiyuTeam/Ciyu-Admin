package com.company.ciyu.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "MEET", indexes = {
        @Index(name = "IDX_MEET_BOND_ID", columnList = "BOND_ID")
})
@Entity
public class Meet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ARTICLE_ID")
    private String articleId;

    @JoinColumn(name = "MEANING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Meaning meaning;

    @JoinColumn(name = "BOND_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Bond bond;

    @Column(name = "QUALITY")
    private Double quality;


    @CreatedDate
    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    public void setCreatedTime(LocalDateTime createdDate) {
        this.createdTime = createdDate;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public void setMeaning(Meaning meaning) {
        this.meaning = meaning;
    }

    public Meaning getMeaning() {
        return meaning;
    }

    public Bond getBond() {
        return bond;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}