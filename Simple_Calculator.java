package Practical_list;
import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a first number:- ");
        int num1= sc.nextInt();
        System.out.print("Enter a second number:- ");
        int num2=sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/):- ");
        char operator=sc.next().charAt(0);

        int a;
        switch (operator) {
            case '+':
                a = num1 + num2;
                break;
            case '-':
                a = num1 - num2;
                break;
            case '*':
                a = num1 * num2;
                break;
            case '/':
                a = num1 / num2;
                break;

            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("Result of these number is:- "+a);


        }


    }

