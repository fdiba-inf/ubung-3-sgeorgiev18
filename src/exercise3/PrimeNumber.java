package exercise3;
import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    int b = 0;
    boolean c;  

    do {
      System.out.print("Enter your number: ");
      a = input.nextInt();      
      if (a % 2 == 0){
        if (a / 2 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 3 == 0) {
        if (a / 3 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }

      } else if (a % 5 == 0) {
        if (a / 5 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 7 == 0) {
        if (a / 7 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 11 == 0) {
        if (a / 11 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else{ 
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 13 == 0) {
        if (a / 13 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 17 == 0) {
        if (a / 17 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else if (a % 19 == 0) {
        if (a / 19 == 1) {
          c = false;
          System.out.println("Prime number: " + c);
        } else {
        c = true;
        System.out.println("Prime number: " + c);
        }
      } else {
        c = false;
        System.out.println("Prime number: " + c);
      }
  } while (a > 2);
  System.out.print("Invalid number");
 }
}