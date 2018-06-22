package com.moss.common;

public class SimpleResponse {

    private Object content;

    private String targetUrl;

    public SimpleResponse(Object content, String targetUrl) {
        this.content = content;
        this.targetUrl = targetUrl;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
