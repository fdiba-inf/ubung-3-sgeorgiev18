package exercise3;

public class NumberSearch {
  public static void main (String[] args) {
    int s = 0;
    
    for(int a = 100; a < 1000; ++a) {
      if (a % 5 == 0 && a % 6 == 0) {
        if (s < 9) {      
       System.out.print(a + " ");
       ++s;

        } else {
          s = 0;
          System.out.println(a);
        }              
     }
    }
  }
}

