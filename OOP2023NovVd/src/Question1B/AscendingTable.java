package Question1B;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable<T extends Comparable<T>, Y> {
    private Map<T, Y> table = new TreeMap<>();

    public void add(T key, Y value) {
        table.put(key, value);
    }

    public static <T extends Comparable<T>, Y> void display(AscendingTable<T, Y> ascendingTable) {
        for (Map.Entry<T, Y> entry : ascendingTable.table.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}