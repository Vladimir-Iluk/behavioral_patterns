package Memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;
    public void setVersionDate(String version) {
        this.version = version;
        this.date = new Date();
    }
    public Save save(){
        return new Save(version);
    }
    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }
    @Override
    public String toString() {
        return "Project [version=" + version + ", date=" + date + "]";
    }
}
