package Startegy;

public class Cook {
    ActivityStrategy activity;

    public void setActivity(ActivityStrategy activity) {
        this.activity = activity;
    }
    public void execute() {
        activity.Operation();
    }
}
