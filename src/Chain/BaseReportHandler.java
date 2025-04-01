package Chain;

public class BaseReportHandler extends Handler {
    public BaseReportHandler(int priority) {
        super(priority);
    }
    @Override
    public void write(String message) {
        System.out.println("[BaseReportHandler] " + message);
    }
}
