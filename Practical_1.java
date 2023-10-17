
import java.util.Scanner;
public class Practical_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values :-");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();

        if(((a*d)-(b*c))==0 || e==0){
            System.out.println("The solution has no solution... ");
        }
        else{
            float x=(((e*d)-(b*f))/((a*d)-(b*c)))/e;
            System.out.println("Solution of x:- "+x);
            float y=(((a*f)-(e*c))/((a*d)-(b*c)))/f;
            System.out.println("Solution of y:- "+y);
        }


    }
}
