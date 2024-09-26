package extend_lesson.comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person>people = new ArrayList<>(Arrays.asList(new Person("dat",19),
                new Person("dat2",19),new Person("An",20)));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
        /**/
        //iterator
        Iterator<Person>iterator=people.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
            //map
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
            System.out.println(map);
            System.out.println(map.get(3));
            for (Map.Entry<Integer,String>:map.entrySet()){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
            Map<Integer,Person>personMap = new HashMap<>();
        }
    }
}
