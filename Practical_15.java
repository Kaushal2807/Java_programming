

import java.util.Scanner;

public class Practical_15 {
    public static void gcd(int a, int b) {
        byte flag = 0;
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for(i=i; i>1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integers := ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcd(a,b);
    }
}