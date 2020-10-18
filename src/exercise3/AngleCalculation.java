package exercise3;
import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    char l;      
    double number;  
    do {
      number = input.nextDouble();
      l = input.next().charAt(0);      
      boolean positive = (l == 'r' || l == 'd');
      double Radiant = (number * Math.PI) / 180;
      double Grad = (number * 180) / Math.PI;
      if (positive) {
        if (l == 'r') {          
          System.out.println("Angle: " + Grad + " " + 'd');          
        } else if (l == 'd') {          
          System.out.println("Angle: " + Radiant + " " + 'r');
        }        
      } else {
        break;
      }
    } while(number > 0 && number < 180); 
  }
}