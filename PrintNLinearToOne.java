import java.util.Scanner;

public class PrintNLinearToOne {

   public static void main(String[] args){
       Scanner obj= new Scanner(System.in);
       int n=obj.nextInt();
       Function(n,n);
   }
   static void Function(int i, int n){
       if(i<1)
           return;
       System.out.println(i);
       Function(i-1,n);
   }
}
/*
Recursive function to print N to 1 linearly
 */
