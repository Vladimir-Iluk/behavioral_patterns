package Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleText implements MediatorChat{
    MediatorUser admin;
    List<MediatorUser> users= new ArrayList<>();

    public void setAdmin(MediatorUser admin) {
        this.admin = admin;
    }
    public void setUsers(MediatorUser user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, MediatorUser user) {
        for(MediatorUser u : users){
            if(u!=user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
