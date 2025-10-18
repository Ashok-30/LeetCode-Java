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
1st iteration
f(5,5)-> if condition fails
f(4,5)-> if condition fails
f(3,5)-> if condition fails
f(2,5)-> if condition fails
f(1,5)-> if condition fails
f(0,5)-> if condition pass
return simply means:

“Stop executing this function and go back to the place it was called from.”
returns to f1 prints 1
returns to f2 print 2
returns to f3 print 3
returns to f4 print 4
returns to f5 print 5

 */