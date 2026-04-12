import java.util.*;
import java.util.stream.*;
public class Filter_Map{
    public static void main(String[] args) {
        List<Integer>addgrade=Arrays.asList(23,56,7,23,76,43);
        addgrade.stream()
        .filter(i->i<=45)
        .map(i->i+5)
        .forEach(System.out::println);
    }
}