package extend_lesson.comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(new Person("Dat", 17),

                new Person("Dat2", 19), new Person("An", 18)));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);
        System.out.println(map.get(3));
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<Integer, Person> personMap = new HashMap<>();
    }
}






