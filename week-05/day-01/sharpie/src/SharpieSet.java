import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpieSet;

    public SharpieSet() {
        sharpieSet = new ArrayList<>();
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie usable : sharpieSet) {
            if (usable.inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (Sharpie trash : sharpieSet) {
            if (trash.inkAmount == 0) {
                sharpieSet.remove(trash);
            }
        }
    }
}
