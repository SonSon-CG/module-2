import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int RATE = 23000;
        System.out.println("nhap usd");
        Scanner sc = new Scanner(System.in);
        int usd = sc.nextInt();
        int vnd = usd * RATE;
        System.out.println(vnd);

    }
}