package exercise3;

public class NumberSearch {
  public static void main (String[] args) {
    
    for(int a = 100; a < 1000; ++a) {
      if (a % 5 == 0 && a % 6 == 0) {      
       System.out.print(a + ", ");
              
     }
    }
  }
}

