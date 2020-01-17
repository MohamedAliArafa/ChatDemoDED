package com.example.chatdemo.ChatSplash;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 9/3/17.
 */

public class ResultModel {
    @SerializedName("messages")
    @Expose
    private List<Message> messages = new ArrayList<>();
    @SerializedName("options")
    @Expose
    private List<Option> options = new ArrayList<>();

    @SerializedName("messages_reply")
    @Expose
    private List<Message> replies = new ArrayList<>();

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Message> getReplies() {
        return replies;
    }

    public void setReplies(List<Message> replies) {
        this.replies = replies;
    }
}
