import java.util.*;
import java.util.stream.*;
public class Reverse{
    public static void main(String[] args) {
        List<Integer> reverseee=Arrays.asList(34,56,23,67,234);
        reverseee.stream()
        .sorted((a,b)->-a.compareTo(b))
        .forEach(System.out::println);
    }
}
