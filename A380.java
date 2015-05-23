/*
 * Timus OJ - 1893
 * A380
 */
import java.io.*;
import java.util.*;

public class A380 {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(solve(f.readLine()));
    f.close();
  }
  public static String solve(String s) {
    int rowNum = Integer.parseInt(s.substring(0, s.length() - 1));

    char letter = s.charAt(s.length() - 1);
    if (letter == 'A')
       return "window";
    if (1 <= rowNum && rowNum <= 2) {
       if (letter == 'D')
         return "window";
       return "aisle";
    }
    if (3 <= rowNum && rowNum <= 20) {
       if (letter == 'F')
         return "window";
       else
         return "aisle";
    }
    if (letter == 'K')
       return "window";
    if (letter == 'C' || letter == 'D' || letter == 'G' || letter == 'H')
       return "aisle";
    return "neither";
  }
}
