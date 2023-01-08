import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered chemicals.
        Scanner scanner = new Scanner(System.in);

        // Stores the chemical X.
        int X = scanner.nextInt();

        // Stores the chemical Y.
        int Y = scanner.nextInt();

        // Stores the chemical A.
        int A = scanner.nextInt();

        // Stores the chemical B.
        int B = scanner.nextInt();

        // Stores the heart rate.
        int heartRate = scanner.nextInt();

        // Checks if the person is telling the truth.
        if ((X + Y > 30) || (A > 3 || B < 6) || (heartRate == 70 && X > 3)) {
            System.out.println("The person is telling the truth");
        } else {
            System.out.println("The person is lying");
        }
    }
}