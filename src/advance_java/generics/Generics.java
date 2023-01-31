package advance_java.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Ernest");
        String name = (String) names.get(0);
        System.out.println("First name: "+ names);

        List<String> names2 = new ArrayList();
        names.add("Emmanuel");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
    }
}
