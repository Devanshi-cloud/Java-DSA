import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
class Mapping{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("mango", 30);
        map.put("grapes", 40);
        map.put("orange", 50);

        Map<String, Integer> sap = new LinkedHashMap<>();
        sap.put("apple", 10);
        sap.put("banana", 20);
        sap.put("mango", 30);
        sap.put("grapes", 40);
        sap.put("orange", 50);
    }
}
