package exercise3;
import java.util.Scanner;

public class NumberCounter {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double a;
    int b = 0;
    int c = 0;
    double sum = 0.0;
    do {
      System.out.print("Enter your number: ");
      a = input.nextDouble();
      if (a < 0) {
        ++c;
      } else if (a > 0) {
        ++b;
      }
      sum += a;

    } while (a != 0);
    double average = sum / (b + c);

    System.out.println("Positive numbers: " + b);
    System.out.println("Negative numbers " + c);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}

