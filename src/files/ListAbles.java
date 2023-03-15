package files;

import java.util.ArrayList;
import java.util.List;

public class ListAbles {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        numbers.stream()
                .forEach((n) -> System.out.println(n));
    }
}
