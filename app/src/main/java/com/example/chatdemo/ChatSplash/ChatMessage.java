package com.example.chatdemo.ChatSplash;

/**
 * Created by root on 8/31/17.
 */

public class ChatMessage {
    private String body;
    private boolean isMine;// Did I send the message.
    private Integer drawable;

    public ChatMessage(String messageString, Integer drawable, boolean isMINE) {
        body = messageString;
        isMine = isMINE;
        this.drawable = drawable;
    }

    public Integer getDrawable() {
        return drawable;
    }

    public void setDrawable(Integer drawable) {
        this.drawable = drawable;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
