package Chain;

public class HighReportHandler extends Handler{

    public HighReportHandler(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("[HighReportHandler] " + message);
    }
}
