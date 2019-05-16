package main;

import java.util.ArrayList;
import java.util.List;

//cel care face notificare
//poate avea 0 sau mai multi ascultatori pe care ii notifica
public class Subject {
    private List<MyListener> list = new ArrayList<>();

    public void addMyListener(MyListener listener) {
        list.add(listener);
    }

    public void event() {
        list.forEach(MyListener::somethingHappened);
    }
}
