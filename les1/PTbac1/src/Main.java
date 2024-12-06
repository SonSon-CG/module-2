import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("nhap a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        double x = (double) (-b) / a;
        System.out.println("ket qua " + x);

    }
}