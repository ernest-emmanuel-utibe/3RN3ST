package advance_java.linkedLists;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.add(2, "D");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);


    }
}
