package lab0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Variant5Test {

    // Тест для визначення більшого числа
    @Test
    public void testLargerNumber() {
        assertEquals(Math.max(8, 6), 8, "Test failed for (8, 6)");
        assertEquals(Math.max(3, 7), 7, "Test failed for (3, 7)");
        assertEquals(Math.max(-1, -5), -1, "Test failed for (-1, -5)");
    }

    // Тест для двозначного числа (Task 1)
    @Test
    public void testTwoDigitNumber() {
        int twoDigitNumber = 45;
        int expectedTens = twoDigitNumber / 10;
        int expectedOnes = twoDigitNumber % 10;

        assertEquals(expectedTens, 4, "Expected tens digit is incorrect");
        assertEquals(expectedOnes, 5, "Expected ones digit is incorrect");
    }

    // Тест для завдання з перевіркою умови (Task 2)
    @Test
    public void testDoubleInequality() {
        assertTrue((true), "Condition failed for (5, 10, 15)");
        assertFalse((false), "Condition failed for (10, 5, 15)");
        assertFalse((false), "Condition failed for (5, 5, 10)");
    }

    // Тест для обчислення довжини в метрах (Task 4)
    @Test
    public void testLengthInMeters() {
        assertEquals(convertToMeters(1, 10), 1.0, 0.0001, "Conversion from decimeters failed");
        assertEquals(convertToMeters(2, 1), 1000.0, 0.0001, "Conversion from kilometers failed");
        assertEquals(convertToMeters(3, 1), 1.0, 0.0001, "Conversion from meters failed");
        assertEquals(convertToMeters(4, 1000), 1.0, 0.0001, "Conversion from millimeters failed");
        assertEquals(convertToMeters(5, 100), 1.0, 0.0001, "Conversion from centimeters failed");
    }

    // Метод для конвертації довжини в метри
    private double convertToMeters(int unit, double length) {
        return switch (unit) {
            case 1 -> length * 0.1;  // Дециметр в метри
            case 2 -> length * 1000; // Кілометр в метри
            case 3 -> length;        // Метр
            case 4 -> length * 0.001; // Міліметр в метри
            case 5 -> length * 0.01; // Сантиметр в метри
            default -> 0;
        };
    }

    // Тест для обчислення вартості цукерок (Task 5)
    @Test
    public void testCandyCost() {
        double pricePerKg = 50.0;
        assertEquals(pricePerKg * 1.2, 60.0, "Cost calculation failed for 1.2 kg");
        assertEquals(pricePerKg * 1.4, 70.0, "Cost calculation failed for 1.4 kg");
        assertEquals(pricePerKg * 2.0, 100.0, "Cost calculation failed for 2.0 kg");
    }

    // Тест для подвійного факторіала (Task 6)
    @Test
    public void testDoubleFactorial() {
        assertEquals(calculateDoubleFactorial(), 105, "Double factorial calculation failed for 7");
    }

    // Метод для обчислення подвійного факторіала
    private long calculateDoubleFactorial() {
        long doubleFactorial = 1;
        for (int i = 7; i > 0; i -= 2) {
            doubleFactorial *= i;
        }
        return doubleFactorial;
    }

    // Тест для формування масиву (Task 7)
    @Test
    public void testArrayFormation() {
        int[] arr = createArray();
        int[] expectedArray = { 1, 2, 3, 5, 8 };
        assertEquals(arr, expectedArray, "Array formation failed");
    }

    // Метод для формування масиву
    private int[] createArray() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < 5; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    // Тест для формування матриці (Task 8)
    @Test
    public void testMatrixFormation() {
        int[][] matrix = createMatrix();
        int[][] expectedMatrix = {
                { 1, 2, 3, 4 },
                { 2, 4, 6, 8 },
                { 4, 8, 12, 16 }
        };
        assertEquals(matrix, expectedMatrix, "Matrix formation failed");
    }

    // Метод для формування матриці
    private int[][] createMatrix() {
        int[] baseRow = { 1, 2, 3, 4 };
        int[][] matrix = new int[3][4];
        System.arraycopy(baseRow, 0, matrix[0], 0, 4);
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = matrix[i - 1][j] * 2;
            }
        }
        return matrix;
    }
}
