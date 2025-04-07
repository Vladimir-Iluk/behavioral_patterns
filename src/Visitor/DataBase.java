package Visitor;

public class DataBase implements ProjectElement {
    @Override
    public void beWritten(Developer dev) {
        dev.create(this);
    }
}
