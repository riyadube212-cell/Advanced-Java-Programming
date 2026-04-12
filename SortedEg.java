import java.util.*;
import java.util.stream.*;
public class SortedEg{
    public static void main(String[] args) {
        List<String>length=Arrays.asList("Riya","Piyush","Vishal","Mohit","Piyush");
        length.stream().sorted((a,b)->a.length()-b.length())
        .forEach(System.out::println);
    }
}