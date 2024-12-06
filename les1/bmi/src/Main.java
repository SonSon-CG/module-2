import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap height");
        double h = sc.nextDouble();
        System.out.println("nhap weight");
        int w = sc.nextInt();
        double bmi =(double)(w / (h * h));
        if (bmi < 18.5) {
            System.out.println("underweight");
        }else if (bmi < 25) {
            System.out.println("normal");
        }else if (bmi < 30) {
            System.out.println("overweight");
        }else {
            System.out.println("obese");
        }
    }
}