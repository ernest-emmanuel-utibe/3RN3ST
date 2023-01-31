package advance_java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    static  Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] booleanArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(booleanArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
    }
}
