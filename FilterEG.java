
import java.util.*;
import java.util.stream.*;
public class FilterEG{
    public static void main(String[] args) {
        List<Integer> passed=Arrays.asList(24,56,12,67,88,9);
        passed.stream().
        filter(i->i>=50).
        forEach(System.out::println);
    }
}

