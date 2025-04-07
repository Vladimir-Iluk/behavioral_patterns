package Visitor;

public class SeniorDev implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting after junior");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing db");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing normal test after junior");

    }
}
