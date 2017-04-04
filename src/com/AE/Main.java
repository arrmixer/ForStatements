package com.AE;

public class Main {

    public static void main(String[] args) {
        // write your code here
   /*     System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (double interestRate = 2; interestRate < 9; interestRate++) {
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f", calculateInterest(10000, interestRate) ) + ".");
        }
        System.out.println("*********************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i) ) + ".");
        }*/

        int count = 0;
        for (int i = 10; i <=50; i++) {

            if (isPrime(i)) {
                count++;
                System.out.println(i + " is Prime? " + isPrime(i));

            }else if (count >=10){
                System.out.println("Exiting loop.");
                break;
            }




        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
