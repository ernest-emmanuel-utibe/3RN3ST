package advance_java.hashmap;

import java.util.HashMap;

public class Phone_Book {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Ernest", 12345);
        phonebook.put("Emmanuel", 123456);
        phonebook.put("Kathe", 1234567);
        phonebook.put("Katherine", 12345678);
        phonebook.put("Eryn", 123456789);
        phonebook.put(null, 000);
        if (phonebook.containsKey("Eryn")) {

            phonebook.remove("Eryn");
        }

    }
}
