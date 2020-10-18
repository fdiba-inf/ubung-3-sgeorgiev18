package exercise3;
import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double c;


    do {
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();

    double E;
    E = (a + b + c);
    double Area;
    double D;
    D = E * (E - a) * (E - b) * (E - c);
    Area = Math.sqrt(D);
      boolean positive = (a + b > c || a + c > b || c + b > a);
      if (positive == true) {
      System.out.println(Area);
      

      if (a == b && a == c) {
        System.out.println("Triangle: equilateral");
      } else if (a == b && a != c) {
        System.out.println("Triangle: isosceles");
      } else if (a == c && a != b) {
        System.out.println("Triangle: isosceles");
      } else if (b == c && b != a) {
        System.out.println("Triangle: isosceles");
      } else {
        System.out.println("Triangle: scalene");
      }
    }else {
      System.out.println("Values are not correct!");
    }

    } while(a > 0 && b > 0 && c > 0);
    System.out.println("Values are not correct!");
  }
}