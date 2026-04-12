import java.util.*;
import java.util.stream.*;
public class Sort{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(45,76,24,97,24);
        list.stream()
        .sorted().forEach(System.out::println);
    }
}