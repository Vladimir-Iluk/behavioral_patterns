package Chain;

public class LowReportHandler extends Handler {
    public LowReportHandler(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("[LowReportHandler] " + message);
    }
}
