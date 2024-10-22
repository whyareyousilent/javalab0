package lab0;

import java.util.Arrays;

public class variant5 {
    public static void main(String[] args) {
        // Task 1:
        int twoDigitNumber = 45; //
        int tens = twoDigitNumber / 10;
        int ones = twoDigitNumber % 10;
        System.out.println("Task 1: Two-digit number: " + twoDigitNumber);
        System.out.println("Tens: " + tens + ", Ones: " + ones);

        // Task 2:
        int A = 5, B = 10, C = 15; // Приклади цілих чисел
        boolean condition = A < B && B < C;
        System.out.println("Task 2: Is " + A + " < " + B + " < " + C + "? " + condition);

        // Task 3:
        int num1 = 8, num2 = 6; // Приклади двох чисел
        System.out.println("Task 3: Larger number between " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));

        // Task 4:
        int unit = 3;
        double length = 250;
        double lengthInMeters = switch (unit) {
            case 1 -> length * 0.1;
            case 2 -> length * 1000;
            case 3 -> length;
            case 4 -> length * 0.001;
            case 5 -> length * 0.01;
            default -> 0;
        };
        System.out.println("Task 4: Length in meters: " + lengthInMeters);

        // Task 5: Стоимость конфет.
        double pricePerKg = 50.0; // Цена за 1 кг конфет
        System.out.println("Task 5: Price per kg: " + pricePerKg);
        for (double weight = 1.2; weight <= 2.0; weight += 0.2) {
            System.out.printf("Cost for %.1f kg: %.2f%n", weight, (pricePerKg * weight));
        }

        // Task 6: Двойной факториал.
        int N = 7; // Число N (> 0)
        long doubleFactorial = 1;
        for (int i = N; i > 0; i -= 2) {
            doubleFactorial *= i;
        }
        System.out.println("Task 6: Double factorial of " + N + " is: " + doubleFactorial);

        // Task 7:
        int arraySize = 5;
        int first = 1;
        int second = 2;
        int[] arr = new int[arraySize];
        arr[0] = first;
        arr[1] = second;
        for (int i = 2; i < arraySize; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("Task 7: Array: " + Arrays.toString(arr));

        // Task 8:
        int M = 3;
        int NMatrix = 4;
        int Q = 2;
        int[] baseRow = {1, 2, 3, 4};
        int[][] matrix = new int[M][NMatrix];
        for (int i = 0; i < NMatrix; i++) {
            matrix[0][i] = baseRow[i];
        }
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < NMatrix; j++) {
                matrix[i][j] = matrix[i-1][j] * Q;
            }
        }
        System.out.println("Task 8: Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
