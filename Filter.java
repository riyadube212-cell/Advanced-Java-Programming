import java.util.*;
import java.util.stream.*;
import java.util.List;
public class Filter {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,23,45,67);
        list.stream().filter(i-> i%2!=0).forEach(System.out::println);
    }
}