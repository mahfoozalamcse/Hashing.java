import java.util.HashSet;
import java.util.Iterator;

public class ItratorsHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Rampur");
        cities.add("Varansi");
        cities.add("Gurugram");

        // itrate
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // advace loop mathod to iterate

        for (String city : cities) {
            System.out.println(city);
        }

    }
}
