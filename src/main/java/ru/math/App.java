package ru.math;

public class App {

    static double[][] F = {
        {5000, 5500, 6000},
        {4500, 4800, 5100},
        {8000, 4300, 4600}
    };

    static double[][] P = {
        {0.9, 0.85, 0.8},
        {0.85, 0.8, 0.75},
        {0.8, 0.75, 0.7}
    };

    public static void main(String[] args) {

        int numSets = 3;

        double bestResult = 0;

        for (int i = 0; i < numSets; i++) {
            for (int j = 0; j < numSets; j++) {
                for (int k = 0; k < numSets; k++) {

                    double result = F[0][i] * P[0][i] + F[1][j] * P[1][j] + F[2][k] * P[2][k];

                    if (result > bestResult) {
                        bestResult = result;
                    }
                }
            }
        }

        System.out.println("Лучший результат: " + bestResult);
    }
}
