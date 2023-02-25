package dsa_Tasks;

import java.util.Collections;
import java.util.List;

public class StringToArray {
    public static void main(String[] args) {
        String [] currency = {"SGD", "USD", "INR", "GBP", "AUD", "SGD"};
        System.out.println("Size of array: " + currency.length);
        List<String> currencyList = (List<String>) Collections.reverseOrder();

//currencyList.add("JPY"); //Exception in thread "main"
//        java.lang.UnsupportedOperationException
//currencyList.remove("GBP");//Exception in thread "main"
//        java.lang.UnsupportedOperationException

        System.out.println("Size of List: " + currencyList.size());
        System.out.println(currencyList);
    }
}
