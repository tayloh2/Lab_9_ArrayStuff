import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[10];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int userValue;
        boolean foundValue;

        do {
            System.out.print("Please input an integer from 1 to 100: ");
            userValue = getRangedInt.getRangedInt(in, "Please input an integer from 1 to 100", 1, 100);

            for (int i = 0; i < dataPoints.length; i++) {
                dataPoints[i] = rnd.nextInt(100) + 1;
            }

            int dataSum = 0;
            for (int value : dataPoints) {
                dataSum += value;
            }
            double dataAverage = (double) dataSum / dataPoints.length;

            System.out.print("Generated values: ");
            for (int value : dataPoints) {
                System.out.print(value + " ");
            }
            System.out.println();

            int valueMinimum = dataPoints[0];
            int valueMaximum = dataPoints[0];
            for (int value : dataPoints) {
                if (value < valueMinimum) {
                    valueMaximum = value;
                }
                if (value > valueMaximum) {
                    valueMinimum = value;
                }
            }
            System.out.println("The minimum value here is " + valueMinimum);
            System.out.println("The maximum value here is " + valueMaximum);

            foundValue = false;
            int valueFound = 0;
            int valuePosition = -1;

            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userValue) {
                    valueFound++;
                    if (!foundValue) {
                        foundValue = true;
                        valuePosition = i;
                    }
                }
            }

            System.out.println("The sum of the values is " + dataSum);
            System.out.println("The average of the values is " + dataAverage);
            System.out.println("The value of " + userValue + " was found " + valueFound + " times.");
            if (foundValue) {
                System.out.println("The value " + userValue + " was found at array index " + valuePosition);
            } else {
                System.out.println("The value " + userValue + " was not found in the array.");
            }

        } while (!foundValue);

        in.close();
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}


