import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        for (int i = 0; i < 10; i++) {
            // Generate a random number between 1 and 100
            int randomNumber = generateRandomNumber(min, max);

            // Check if the number is even or odd
            if (randomNumber % 2 == 0) {
                System.out.println(randomNumber + " is even.");
            } else {
                System.out.println(randomNumber + " is odd.");
            }
        }
    }

    // Method to generate a random number between min and max (inclusive)
    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;


    }
}