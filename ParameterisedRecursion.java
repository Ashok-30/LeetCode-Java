import java.util.Scanner;


public class ParameterisedRecursion {

        public static void main(String[]args){
            Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            Function(n,0);
        }
        static void Function(int n, int sum){
            if (n<1) {
                System.out.println(sum);
                return ;
            }
            Function(n-1,sum+n);
        }
/*
Print sum of n numbers using parameterised recursion
 */




}
