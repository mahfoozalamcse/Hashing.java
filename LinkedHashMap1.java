import java.util.*;
public class LinkedHashMap1{
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();  // order maintain // douly ll so maintain 
    lhm.put("India" , 20);
    lhm.put("gndonesia" , 30);
    lhm.put("fran" , 50);
    lhm.put("cris" , 20);

    System.out.println(lhm);
  }
}