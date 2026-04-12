import java.util.*;
import java.util.stream.*;
public class Map{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(23,12,45,67,4,6);
        list.stream().map(i->i*2).forEach(System.out::println);
    }
}