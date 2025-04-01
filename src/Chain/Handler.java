package Chain;

public abstract class Handler {
    private Handler next;
    private int priority;
    public Handler(int priority) {
        this.priority = priority;
    }
    public void setNext(Handler next) {
        this.next = next;
    }
    public void HandleManager(String message, int lvl) {
        if(lvl >= priority) {
            write(message);
        }
        if(next != null) {
            next.HandleManager(message, lvl);
        }
    }
    public abstract void write(String message);
}
