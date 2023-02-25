package dsa_Tasks;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToLists {
    public static void main(String[] args) {
        String[] asset = {"equity", "stocks", "gold",
                "foreign exchange","fixed income", "futures", "options"};
        List<String> assetList = Arrays.asList(asset);
        System.out.println(assetList);
    }
}
