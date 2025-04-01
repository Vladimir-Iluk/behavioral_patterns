import Chain.*;

public class Main {
    public static void main(String[] args) {
        Handler lowReportHandler = new LowReportHandler(Priority.LOW);
        Handler baseReportHandler = new BaseReportHandler(Priority.BASE);
        Handler highReportHandler = new HighReportHandler(Priority.HIGH);

        baseReportHandler.setNext(highReportHandler);
        lowReportHandler.setNext(baseReportHandler);

        lowReportHandler.HandleManager("Normal",Priority.LOW);
        baseReportHandler.HandleManager("Warning",Priority.BASE);
        highReportHandler.HandleManager("Doing something!!!",Priority.HIGH);

    }
}