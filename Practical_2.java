
import java.util.Scanner;
public class Practical_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Weight in pounds:= ");
        float pounds= sc.nextFloat();

        float kg=pounds*0.45359237f;
        System.out.println( "Weight in kilogram:= "+kg);


        System.out.print("Height in inches:= ");
        float ich= sc.nextFloat();

        float meter=ich*0.0254f;
        System.out.println("Height in meter:="+meter);


        float BMI=kg/(meter*meter);
        System.out.println("Body Mass Index(BMI):= "+BMI);
    }
}
