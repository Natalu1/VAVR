import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.collection.Set;

public class VavrOperations {
    public static List<String> addElement(List<String> list, String elementToAdd) {
        // return list.add(elementToAdd)
        return list.append(elementToAdd);
    }
    public static Set<String> addElement(Set<String> set, String elementToAdd){
        return set.add(elementToAdd);
    }
    public static Map<String, String> addElement(Map<String, String> map, String key, String value){
        return map.put(key, value);
    }
}
