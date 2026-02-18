

@FunctionalInterface
interface Sub {
int subtract(int n1,int n2);
   }


public class funct_interface {
    public static void main(String[] args) {
      Sub s=new Sub(){
         @Override
         public int subtract (int n1,int n2){
            return n1-n2;
         }
      };
         int r=s.subtract(100, 40);
         System.out.println("Substraction:"+r);
         Sub s1=( n1, n2)->n1-n2;         //lambda expression 
         int r1=s1.subtract(100, 40);
         System.out.println("Substraction:"+r1);
         }
      }
    