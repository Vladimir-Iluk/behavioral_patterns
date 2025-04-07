package Mediator;

public class UserAdmin implements MediatorUser {
    MediatorChat chat;
    String name;
    public UserAdmin(MediatorChat chat, String name) {
        this.chat = chat;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "  get message " + message);

    }
}
