package com.czm.entity;

import java.util.Date;

public class Upvote {
    private Long id;

    private Long agreeuserId;

    private Long articleId;

    private String ip;

    private String agreement;

    private String disagreement;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgreeuserId() {
        return agreeuserId;
    }

    public void setAgreeuserId(Long agreeuserId) {
        this.agreeuserId = agreeuserId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    public String getDisagreement() {
        return disagreement;
    }

    public void setDisagreement(String disagreement) {
        this.disagreement = disagreement == null ? null : disagreement.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}