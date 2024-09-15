import java.util.Scanner;

public class P3_Utility {
    public static long factorial(long value) {
        long fact = 1;
        for (int i = 1; i <= value; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = input.nextInt();

        long factorialResult = factorial(value);
        System.out.println("Factorial Value Is = " + factorialResult);

        boolean isPrimeResult = isPrime(value);
        if (isPrimeResult) {
            System.out.println(value + " is a Prime Number.");
        } else {
            System.out.println(value + " is not a Prime Number.");
        }

        boolean isEvenResult = isEven(value);
        if (isEvenResult) {
            System.out.println(value + " is an Even Number.");
        } else {
            System.out.println(value + " is not an Even Number.");
        }

        boolean isOddResult = isOdd(value);
        if (isOddResult) {
            System.out.println(value + " is an Odd Number.");
        } else {
            System.out.println(value + " is not an Odd Number.");
        }
    }
}