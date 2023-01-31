package advance_java.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Phonebook2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, false);
        phonebook.put("Nathaniel", 12345);
        phonebook.put("Mogul", 123456);
        phonebook.put("Chung", 1234567);
        phonebook.put("Wung", 12345678);
        System.out.println("Nathaniel's number: " + phonebook.get("Nathaniel"));

        System.out.println("\nList of contacts in phonebook: ");
        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
