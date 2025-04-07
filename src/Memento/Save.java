package Memento;

import java.util.Date;

public class Save {
    private final String version;
    private final Date date;
    public Save(String version) {
        this.date = new Date();
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
