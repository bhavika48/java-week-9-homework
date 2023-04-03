package week_9_homework;
/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Map;

public class Pro_9_HashMapObjectPeople {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alena");
        map.put(3, "Cat");
        map.put(4, "Mat");
        map.put(5, "Paige");
        map.put(6, "Ann");

        for (Map.Entry<Integer, String> person : map.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());

        }
    }
}
