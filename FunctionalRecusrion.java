import java.util.Scanner;
import java.util.function.Function;

public class FunctionalRecusrion {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int n =obj.nextInt();
        System.out.println(Function(n));
    }
    static int Function(int n){
        if(n==0){
            return 0;

        }
        return n+Function(n-1);
    }
}


