package me.zeroest.designpattern.observer.before;

public class Client {
    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("DesignPattern", "Observer");
        user1.sendMessage("Hello", "Hello");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("DesignPattern"));
        /*
        [Observer]
        */

        user1.sendMessage("DesignPattern", "Visitor");
        System.out.println(user2.getMessage("DesignPattern"));
        /*
        [Observer, Visitor]
        */

        user2.sendMessage("Hello", "World");
        System.out.println(user1.getMessage("Hello"));
        /*
        [Hello, World]
        */

    }
}
