
import java.util.Scanner;
public class Practical_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String := ");
        String str = sc.nextLine();
        int length = str.length();

        System.out.println("The size of " + "the String is " + length);
        System.out.print("Second-Half of the String is := ");
        System.out.println(str.substring(length/2,length));
    }
}