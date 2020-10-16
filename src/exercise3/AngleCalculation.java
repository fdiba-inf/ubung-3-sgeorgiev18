package exercise3;
import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    char l;
    double Grad;    
    do {
      Grad = input.nextDouble();
      l = input.next().charAt(0);
      double Radian = (Grad * 3.14) / 180;
      Grad = 3.14 / 180 * Radian;
      boolean positive = (l == 'r' || l == 'd');
      if (positive) {
        if (l == 'r') {
          System.out.println(Radian + " " + 'd');
        } else if (l == 'd') {
          System.out.println(Grad + " " + 'r');
        }        
      } else {
        break;
      }
    } while(Grad > 0 && Grad < 180); 
  }
}