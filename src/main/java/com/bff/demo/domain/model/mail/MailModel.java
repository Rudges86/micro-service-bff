package com.bff.demo.domain.model.mail;

public class MailModel {
    private String body;
    private String to;
    private String subject;

    public MailModel() {
    }

    public MailModel(String body, String to, String subject) {
        this.body = body;
        this.to = to;
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
