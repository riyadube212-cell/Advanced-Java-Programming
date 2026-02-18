interface Calcc{
    void add(int n1,int n2);
}


public class Calc {
public static void main(String[] args) {
    Calcc sum=(int n1,int n2)->{
        System.out.println("Sum=");
        System.out.println((n1+n2));
    };
sum.add(23,34);
    Calcc sum1=(int n1,int n2)->System.out.println("Sum="+(n1+n2));
    sum1.add(23,54);
}
}