package exercise3;
import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double Grad;  
    char l;
    do {
      Grad = input.nextDouble();
      l = input.next().charAt(0);
      double Radian = (Grad * 3.14) / 180;
      boolean positive = (l == 'r' || l == 'd');
      if (positive == true) {
        if (l == 'r') {
          System.out.println(Radian + " " + l);
        } else if (l == 'd') {
          System.out.println(Grad + " " + l);
        }        
      } else {
        break;
      }
    } while(Grad > 0 && Grad < 180); 
  }
}