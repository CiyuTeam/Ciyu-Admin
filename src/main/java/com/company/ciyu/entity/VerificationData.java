package com.company.ciyu.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
public class VerificationData {
    private String loginToken;

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }
}