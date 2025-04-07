package Visitor;

public class Projectttt implements ProjectElement {
    ProjectElement[] elements;
    public Projectttt() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }
    @Override
    public void beWritten(Developer dev) {
        for(ProjectElement element : elements) {
            element.beWritten(dev);
        }
    }
}
