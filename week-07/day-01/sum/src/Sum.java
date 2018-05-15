import java.util.ArrayList;
import java.util.List;

public class Sum {
    private ArrayList<Integer> numbers;

    public Sum() {
        this.numbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumOfElements() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
