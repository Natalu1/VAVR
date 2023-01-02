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

    public static List<String> removeElement(List<String> list, String elementToRemove){
        return list.remove(elementToRemove);
    }

    public static Set<String> removeElement(Set<String> set, String elementToRemove){
        return set.remove(elementToRemove);
    }

    public static Map<String, String> removeElement(Map<String, String> map, String key){
        return map.remove(key);
    }
}
