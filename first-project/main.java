import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четыре целых числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("Максимальное число: " + max);
    }
}