import java.util.Scanner;


public class Practise {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter " + n + " elements:");
//        for (int i = 0; i <n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        reverseArray(0,arr,n);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        sc.close();
        String s="madamas";
        System.out.print(palindrome(0,s));
    }

    private static void reverseArray(int i,int arr[],int n) {
        if(i>=n/2) return;
        swap(arr,i,n-i-1);
        reverseArray(i+1,arr,n);
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

     static boolean palindrome(int i,String s){
        if(i>=s.length()/2) return  true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return palindrome(i+1,s);
    }
}
