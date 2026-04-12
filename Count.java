import java.util.*;
import java.util.stream.*;

public class Count {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23,44,13,67,98,43,88);

        long count = list.stream()
                         
                         .count();

        System.out.println(count);
    }
}