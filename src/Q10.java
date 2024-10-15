/*

Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
 public class Q10 {

     public static void main(String [] args) {
         // number n is input and to print

         int N = 8;

         // looping from 1to 10 to print the table
         for (int i = 1; i <= 10; i++) {
             //printing the N*i,ie ith multiple of n.
             System.out.println( N + " * " +i + " = " + N * i);
         }
         }
     }

