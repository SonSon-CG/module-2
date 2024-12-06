import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("nhap thang vao");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("28 hoac 29");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31");
                break;
            case 4, 6, 9, 11:
                System.out.println("30");
                break;
            default:
                System.out.println("nhap lai");
        }
    }
}