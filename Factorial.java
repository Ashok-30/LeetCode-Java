import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        Function(n,1);
    }
    static void Function(int n, int fact){
        if(n<1){
            System.out.println(fact);
            return ;
        }

        Function(n-1,fact*n);
    }
}
