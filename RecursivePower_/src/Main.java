import java.util.Scanner;

public class Main {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        } else {
            return base * power(base, exponent - 1); // Recursive case
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);

        System.out.println("Sonuç: " + result);
    }
}