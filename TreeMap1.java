import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();   // red black tree is used to implement
        tm.put("India" , 20);
        tm.put("gndonesia" , 30);
        tm.put("fran" , 50);
        tm.put("cris" , 20);

        System.out.println(tm);
    }

}
