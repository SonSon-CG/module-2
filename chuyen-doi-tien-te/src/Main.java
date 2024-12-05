import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the value of usd: ");
        usd = a.nextDouble();
        double result = usd * vnd;
        System.out.println(result);



    }
}