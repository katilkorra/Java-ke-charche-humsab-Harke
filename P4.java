import java.util.Scanner;

class Number {

    private static double num;

    public Number(double num) {
        Number.num = num;
    }

    //isZero Number Check
    public static boolean isZero() {
        return num == 0;
    }

    //isPositive Number Check
    public static boolean isPositive() {
        return num > 0;
    }

    //isNegative Number Check
    public static boolean isNegative() {
        return num < 0;
    }

    //Is Odd Number Check
    public static boolean isOdd() {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

    //Is Even Number Check
    public static boolean isEven() {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    //getFactorial Number
    public static double getFactorial() {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num;
        System.out.print("Enter Any Number:=");
        num = sc.nextDouble();

        Number n1=new Number(num);

        //Zero Check
        boolean z = Number.isZero();
        if (z) {
            System.out.println(num + " is Zero.");
        } else {
            System.out.println(num + " is Not Zero.!!");
        }

        //Positive Check
        boolean p = Number.isPositive();
        if (p) {
            System.out.println(num + " is Positive.");
        } else {
            System.out.println(num + " is Not Positive.!!");
        }

        //Negative Check
        boolean n = Number.isNegative();
        if (n) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println(num + " is Not Negative.!!");
        }

        //Odd Check
        boolean o = Number.isOdd();
        if (o) {
            System.out.println(num + " is Odd Number.");
        } else {
            System.out.println(num + " is Not Odd Number.!!");
        }

        //Even Check
        boolean e = Number.isEven();
        if (e) {
            System.out.println(num + " is Even Number.");
        } else {
            System.out.println(num + " is Not Even Number.!!");
        }

        //factorial value
        double fact = Number.getFactorial();
        System.out.println(num + " Factorial Value is " + fact);

        if(sc!=null)
        {
            sc.close();
        }
    }
}