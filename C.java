import java.util.*;
import java.util.stream.*;
public class Compar{
    public static void main(String[] args) {
        List<Integer> ccomparator=Arrays.asList(23,54,67,134,567,33,6);
        ccomparator.stream() 
        .sorted((a,b)->(a<b)?1:(a>b)?-1:0)
        .forEach((System.out::println));
    }
}