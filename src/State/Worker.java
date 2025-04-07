package State;

public class Worker {
    Activity activity;
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity() {
        if(activity instanceof Reading) {
            setActivity(new Writing());
        } else if(activity instanceof Writing) {
            setActivity(new Eating());
        }else if(activity instanceof Eating) {
            setActivity(new Walk());
        }else if (activity instanceof Walk) {
            setActivity(new Reading());
        }
    }
    public void Operation() {
        activity.Operation();
    }
}
