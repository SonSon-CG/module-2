import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dien height");
        int height = sc.nextInt();
        System.out.println("Dien cmm");
        int width = sc.nextInt();
        int s = height * width;
        System.out.println(height*width);
        System.out.println(s);
    }
}