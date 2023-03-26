package me.zeroest.designpattern.observer.before;

import java.util.List;

public class User {
    public User(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    private final ChatServer chatServer;

    public void sendMessage(String subject, String message) {
        chatServer.add(subject, message);
    }

    public List<String> getMessage(String subject) {
        return chatServer.getMessage(subject);
    }

}
