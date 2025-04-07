package Observer;

import java.util.List;

public class Subs implements Observer {
    String name;
    public Subs(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + "we find new vacancies " + vacancies);
    }
}
