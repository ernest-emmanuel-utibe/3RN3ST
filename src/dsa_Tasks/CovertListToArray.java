package dsa_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CovertListToArray {
    public static void main(String[] args) {
        List<String> assetList = new ArrayList();
        String[] asset = {"equity", "stocks", "gold", "foriegn exchange",
                "fixed income", "futures", "options"};

        System.out.println(Collections.addAll(assetList, asset));
    }
}
