package Visitor;

public class JuniorDev implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writting bad class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop db");
    }

    @Override
    public void create(Test test) {
        System.out.println("Write bad test");
    }
}
