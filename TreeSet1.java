import java.util.TreeSet; // sorted order

public class TreeSet1 { // null value not allow insert // less optamized
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Rampur");
        cities.add("Varansi");
        cities.add("Gurugram");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
