package Mediator;

public class User implements MediatorUser {
    MediatorChat chat;
    String name;
    public User(String name, MediatorChat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name +  " send message " + message);
    }
}
