/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing thing) {
        if (completed == thing.completed){
            return name.compareTo(thing.name);
        } else if (thing.completed) {
            return 1;
        } else if (!thing.completed) {
            return -1;
        }
        return 0;
    }
}
