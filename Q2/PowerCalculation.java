package com.gradedproject.Q2;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number X: ");
        int x = scanner.nextInt();

        System.out.print("Enter the power N: ");
        int n = scanner.nextInt();

        long result = calculatePower(x, n);

        System.out.println("X power N is: " + result);

        scanner.close();
    }

    public static long calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            // Handle negative exponent
            return 1 / calculatePower(x, -n);
        } else if (n % 2 == 0) {
            // For even powers, use the recursive formula: X^N = (X^(N/2))^2
            long halfPower = calculatePower(x, n / 2);
            return halfPower * halfPower;
        } else {
            // For odd powers, use the recursive formula: X^N = X * (X^(N/2))^2
            long halfPower = calculatePower(x, n / 2);
            return x * halfPower * halfPower;
        }
    }
}
