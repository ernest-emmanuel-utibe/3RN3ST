package array;

import java.util.ArrayList;
import java.util.List;

public class StringCheck {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("spring");
        lines.add("");
        lines.add("spring-mvc");
        lines.add("springboot");
        lines.add("");
        lines.add("java");

        List<String> nonEmptyList = lines.stream()
                .filter(i -> !i.isBlank())
                .toList();

        System.out.println(nonEmptyList);
    }
}
