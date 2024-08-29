import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        int arr[] = new int[]{6,8,9};

        integers.add(4);
        integers.add(4);
        integers.add(5);
        System.out.println(integers);
        System.out.println(integers.get(1));
        ArrayList<Integer> doubles= new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> doubles2 = new ArrayList<>(Arrays.asList(6,8,9));
        //doubles.removeAll(doubles);
        doubles.addAll(doubles2);
        //doubles.clear();
        doubles.removeAll(doubles2);
        Collections.sort(doubles);
        System.out.println(doubles);
        doubles.set(1,6);
        System.out.println(doubles);
     }
}
