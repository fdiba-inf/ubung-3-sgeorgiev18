package exercise3;
import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    b = 2;
    boolean c;    
    a = input.nextInt();

    while (a > 2) {

      if (a % b == 0 && a != b) {
        c = false;
        System.out.println("Prime number: " + c);
        break;        
      } else if (a % b != 0) {
        ++b;
      }  else {
        c = true;
        System.out.println("Prime number: " + c);
        break;
      }


    }

  }
}