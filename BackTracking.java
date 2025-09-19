import java.util.Scanner;

public class BackTracking {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        Function(n,n);
    }
    static void Function(int i, int n){
        if(i<1)
            return;
        Function(i-1,n);
        System.out.println(i);
    }
}
/*
Back trackking using recursion
print numners from 1 to N without using i+1
 */