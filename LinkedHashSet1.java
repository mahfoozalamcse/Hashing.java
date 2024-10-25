
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
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
