import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your mass:");
        int mass = scanner.nextInt();

        System.out.println("Please enter your length:(For example: 1,72)");
        double length = scanner.nextDouble();

        double bmi = mass / (length * length);

        System.out.println("Your bmi:" + bmi);

    }
}