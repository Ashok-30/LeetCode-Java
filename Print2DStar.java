import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.log10;


public class Print2DStar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        /// Looping conditions if you want to print from 1
        //start i=1 and condition i<= and inner loop j<n-i
        // if else use i=0 and condition i< and inner loop j<n-i+1

        //print 7 and 8 together to get pattern 9
//
// System.out.print(isGCD2(11,13));
//        isDivisors(36);
//        isPrime(11);

        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
//        solve(arr,n);
        leftRotate(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    static void leftRotate(int arr[],int n, int k){
        k=k%n;
        if(k==n)
            return;
        if(k>n)
            return;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i]; // temp[1,2]
        }
        for(int i=0;i<n-k;i++){//7-2=5 [1,2,3,4,5,6,7]
            arr[i]=arr[i+k];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j]; // we can also use temp[i-n+k] 5 - 7 +2 =o instead of j=0 and j++;
            j++;
        }

    }

     static void solve(int[] arr, int n) {
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }

    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void print5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void print7(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            /*
            On row i, we print n - i - 1 spaces before the stars.
            This decreases each row (e.g., for n=5: 4,3,2,1,0), pushing stars to the center.
            for decreasing order condition n-i-1
             */
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            //Row i prints 2*i + 1 stars — always an odd number: 1, 3, 5, 7, …
            //for odd number order condition 2*i-1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }

            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    static void print8(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            // 2 * n - (2 * i - 1) print odd number in reverse order 9 7 5 3 1
            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
                System.out.print("*");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    static void print10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }

    static void print12(int n) {
        int space = 2 * (n - 1);
        for (int i = 0; i <= n; i++) {
            // numbers
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;


        }
    }

    static void print15(int N) {

        // Outer loop for the number of rows.
        for (int i = 1; i <= N; i++) {

            // Inner loop will loop for i times and
            // print alphabets from A to A + (N-i-1).
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    /// Print count of numbers
    static int printCount(int n) {
//        int count=0;
//        while(n>0){
//            count+=1;
//            n=n/10;
//        }
//        return count;

        //Alternate method is
        int c = (int) (log10(n) + 1);
        return c;
    }

    /// /Reverse a number

    static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n /= 10;
            reverse = (reverse * 10) + lastdigit;
        }
        return reverse;

    }

    /// /Armstrong number
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        // count digits
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;  // get last digit
            sum += Math.pow(digit, digits); // raise to power of total digits
            number /= 10;  // remove last digit
        }

        return sum == original;
    }

    /// print all divisors
    static void isDivisors(int n) {
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
        /// /Alternate method
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= i * i; i++) {
            if (n % i == 0) {
                ls.add(i);
                if ((n / i) != i) {
                    ls.add(n / i);
                }
            }
            Collections.sort(ls);


        }
        System.out.println(ls);
    }

    /// Prime number a number which has 2 factors 1 and itself
    static boolean isPrime(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }

        }
        if (count==2){
            return true;
        }
        else return false;
    }

    /// /GCD OR HCF Greatest common divisor between two number or hgihest common factor
    static int isGCD(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }


        }
        return gcd;

        /// Alternate method
//        for (int i = Math.min(n,m); i >= 1; i--) {
//            if(n%i==0 && m%i==0){
//                System.out.println(i);
//                break;
//            }
//
//
//        }

    }
    static int isGCD2(int a,int b){
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        int gcd = (a == 0) ? b : a;
        return gcd;

    }



    /// /Fibanacci number

    /// 0, 1, 1,2,3,5,8,13....
    /*
    Easy way is to write iterative for loop
    f[0]=0
    f[1]=1
    for(i=2;i++;i<n){
    f[i]=f[i-1]+f[i-2]
             */
    /// //Multiple recrusive call




}
