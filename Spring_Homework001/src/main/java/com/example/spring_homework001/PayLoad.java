package com.example.spring_homework001;

public class PayLoad {
    private String message;
    private Post payload;
    private String status;
    private String creationTime;

    public PayLoad() {
    }

    public PayLoad(String message, Post payload, String status, String creationTime) {
        this.message = message;
        this.payload = payload;
        this.status = status;
        this.creationTime = creationTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Post getPayload() {
        return payload;
    }

    public void setPayload(Post payload) {
        this.payload = payload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}