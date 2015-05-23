/*
 * Timus OJ - 1197
 * Lonesome Knight
 */

import java.io.*;
import java.util.*;

public class Knight {
  public static void main(String[] args) {
    try {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(f.readLine());
      while (n-- > 0) {
        String pos = f.readLine();
        int result;
        if (isCorner(pos))
           result = 2;
        else if (isInMiddle(pos))
           result = 8;
        else if (isInSixZone(pos))
           result = 6;
        else if (isInThreeZone(pos))
           result = 3;
        else
           result = 4;
        System.out.println(result);
      }
      f.close();
      System.exit(0);
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
  public static boolean isCorner(String s) {
    return (s.charAt(0) == 'a' || s.charAt(0) == 'h') &&
           (s.charAt(1) == '1' || s.charAt(1) == '8');
  }
  public static boolean isInMiddle(String s) {
    return ('c' <= s.charAt(0) && s.charAt(0) <= 'f') &&
           ('3' <= s.charAt(1) && s.charAt(1) <= '6');
  }
  public static boolean isInSixZone(String s) {
    return ((s.charAt(0) == 'b' || s.charAt(0) == 'g') &&
           ('3' <= s.charAt(1) && s.charAt(1) <= '6')) ||
           ((s.charAt(1) == '2' || s.charAt(1) == '7') &&
           ('c' <= s.charAt(0) && s.charAt(0) <= 'f'));
  }
  public static boolean isInThreeZone(String s) {
    return s.equals("a2") || s.equals("b1") || s.equals("g1") ||
           s.equals("h2") || s.equals("a7") || s.equals("b8") ||
           s.equals("g8") || s.equals("h7");
  }
}
