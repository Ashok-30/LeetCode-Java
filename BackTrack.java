import java.util.Scanner;

public class BackTrack {
public static void main(String[]args){

    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    Function(1,n);

}
static void Function(int i, int n){
    if(i>n)
        return;
    Function(i+1,n);
    System.out.println(i);
}

}

/*
Print N to 1 using backtracking without using i-1
 */



