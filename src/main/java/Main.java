import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.collection.Set;

public class Main {
    public static void main(String[] args) {
        //VAVR COLLECTIONS
        List<String> vavrList = VavrCollectionsFactory.createList();
        Set<String> vavrSet = VavrCollectionsFactory.createSet();
        Map<String, String> vavrMap = VavrCollectionsFactory.createMap();

        // VAVR TO java.util
        java.util.List<String> javaList = VavrCollectionsFactory.toJava(vavrList);
        java.util.Set<String> javaSet = VavrCollectionsFactory.toJava(vavrSet);
        java.util.Map<String, String> javaMap = VavrCollectionsFactory.toJava(vavrMap);

        // java.util back to VAVR
        List<String> vavrListCopy = VavrCollectionsFactory.toVavr(javaList);
        Set<String> vavrSetCopy = VavrCollectionsFactory.toVavr(javaSet);
        Map<String, String> vavrMapCopy = VavrCollectionsFactory.toVavr(javaMap);

        System.out.println("FINISH");

    }
}
