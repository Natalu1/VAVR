import io.vavr.collection.*;

public class VavrCollectionsFactory {
    public static List<String> createList(){
        return List.of("1", "2");
    }
    public static Set<String> createSet(){
        return HashSet.of("1", "2");
    }
    public static Map<String, String> createMap(){
        return HashMap.of("1", "one",
                "2", "two");
    }
    public static java.util.List<String> toJava(List<String> vavrList){
        return vavrList.toJavaList();
    }
    public static java.util.Set<String> toJava(Set<String> vavrSet){
        return vavrSet.toJavaSet();
    }
    public static java.util.Map<String, String> toJava(Map<String, String> vavrMap){
        return vavrMap.toJavaMap();
    }
}
