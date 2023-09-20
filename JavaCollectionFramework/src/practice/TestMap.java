import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("si",5 );
        hashMap.put("bong",2 );
        hashMap.put("oanh",3 );
        System.out.println("Display entries in hashmap ");
        System.out.println(hashMap+"\n");

        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("si",5);
        treeMap.put("bong",2);
        treeMap.put("oanh",3);
        System.out.println("Display entries ascending oder of key ");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for Lewis is " + linkedHashMap.get("Smith"));
    }
}
