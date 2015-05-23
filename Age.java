/*
 * Timus OJ - 1104
 * Don't ask a woman about her age
 */
import java.io.*;
import java.util.*;

public class Age {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int total = 0;
    int min = 0;
    boolean found = false;
    char[] x = f.readLine().toCharArray();
    for (int i = 0; i < x.length; i++) {
      int a; 
      if (0 <= x[i] && x[i] <= 57)
       a = x[i] - 48;
      else
       a = x[i] - 55;
      total += a;
      if (a > min)
       min = a;
    }
    if (min == 0)
       System.out.println(2);
    else {
       for (int k = min + 1; k <= 36; k++) {
         if (total % (k - 1) == 0) {
           found = true;
           System.out.println(k);
           break;
         }
       }
      if (!found)
        System.out.println("No solution.");
    }
  }
}
