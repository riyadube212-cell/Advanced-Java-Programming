import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class MinMax {
    //minmax having a comparator as a parameter
   //find max
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(23,45,67,89);
       Optional<Integer> result =list.stream().max((a,b)->a);
       result.ifPresent(System.out::println); 
    }
}