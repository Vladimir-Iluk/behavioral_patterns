import Chain.*;
import Command_pattern.*;
import Iterator.Iterator;
import Iterator.JavaDev;
import Mediator.MediatorUser;
import Mediator.SimpleText;
import Mediator.User;
import Mediator.UserAdmin;
import Memento.GitHub;
import Memento.Project;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            boolean running = true;
            while(running) {
                System.out.println("Enter command: ");
                System.out.println("1. Chain");
                System.out.println("2. Command");
                System.out.println("3. Iterator");
                System.out.println("4. Mediator");
                System.out.println("5. Memento");
                System.out.println("0. Exit");
                String option = in.nextLine();
                switch(option) {
                    case "Chain":
                        Handler lowReportHandler = new LowReportHandler(Priority.LOW);
                        Handler baseReportHandler = new BaseReportHandler(Priority.BASE);
                        Handler highReportHandler = new HighReportHandler(Priority.HIGH);

                        baseReportHandler.setNext(highReportHandler);
                        lowReportHandler.setNext(baseReportHandler);

                        lowReportHandler.HandleManager("Normal",Priority.LOW);
                        baseReportHandler.HandleManager("Warning",Priority.BASE);
                        highReportHandler.HandleManager("Doing something!!!",Priority.HIGH);
                        break;
                    case "Command":
                        Editor editor = new Editor("Hello, Command Pattern!");

                        Command printCommand = new ButtonPrint(editor);
                        Command copyCommand = new ButtonCopy(editor);

                        if (printCommand.execute()) {
                            System.out.println("Print command executed successfully.");
                        }

                        if (copyCommand.execute()) {
                            System.out.println("Copy command executed successfully.");
                        }
                        break;
                    case "Iterator" :
                        String[] skills= {"Java","Spirng","Hibernate","SQL","MongoDB"};
                        JavaDev javaDev = new JavaDev("Deveoper", skills);
                        Iterator iterator = javaDev.getIterator();
                        System.out.println("Java Dev "+ javaDev.getName());
                        System.out.println("Skills");
                        while(iterator.hasNext()) {
                            System.out.println(iterator.next().toString()+ " ");
                        }
                        break;
                    case"Mediator":
                        SimpleText chat = new SimpleText();
                        MediatorUser admin = new UserAdmin(chat,"Admin");
                        MediatorUser user = new User("User", chat);
                        MediatorUser user1 = new User("User1", chat);
                        chat.setAdmin(admin);
                        chat.setUsers(user);
                        chat.setUsers(user1);
                        user1.sendMessage("Hello World");
                        break;
                    case "Memento":
                        Project proj = new Project();
                        GitHub git = new GitHub();
                        System.out.println("New project");
                        proj.setVersionDate("Something name");
                        System.out.println(proj);
                        System.out.println("Save to git");
                        git.setSave(proj.save());
                        System.out.println("Update proj");
                        proj.setVersionDate("New version");
                        System.out.println(proj);
                        System.out.println("Back to old version");
                        proj.load(git.getSave());
                        System.out.println(proj);
                        break;
                    case "Exit":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
        }
    }
}