// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Step 1: Treat all numbers as Prime
        // Write a loop that changes ALL numbers to prime (true) in the array.
        for(int k = 2; k < primes.length; k++) {
            // Change all the values to true here

        }

        // Step 2: This is where you remove the primes
        // To start, JUST remove the multiples of 2
        for(int k = 2; k < primes.length; k++) {

        }

    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k = 2; k < primes.length; k++){
            if(){ // Write the Condition yourself
                System.out.print(k + " ");
            }
        }

    }

}



