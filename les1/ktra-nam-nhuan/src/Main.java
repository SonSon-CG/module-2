import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("nhap nam vao");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( a%4 == 0 && a%100 != 0 && a%400 == 0) {
            System.out.println("nhuan");
        }else{
            System.out.println("nhot");
        }
    }
}