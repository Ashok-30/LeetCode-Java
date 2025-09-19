import java.util.Scanner;

public class PrintNTimes {

   public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       Function(1,n);
   }
    static void Function(int i, int n){
       if(i>n)
           return;
       System.out.println("Hi");
       Function(i+1,n);
    }

}
/*
Recursive function to print name N times
 */