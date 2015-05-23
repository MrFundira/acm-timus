/*
 * Timus - 1567
 * SMS spam
 */

import java.io.*;
import java.util.*;

public class SMSSpam {
  public static void main(String[] args) throws IOException {
   BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
   String in = f.readLine();
   int total = 0;
   for (int i = 0; i < in.length(); i++) {
     total += cost(in.charAt(i));
   }
   System.out.println(total);
  }

  private static int cost(char c) {
    if (c == 'a' ||c == 'd' ||c == 'g' ||c == 'j' ||c == 'm' ||
       c == 'p' ||c == 's' ||c == 'v' ||c == 'y' ||c == '.' ||c == ' ')
       return 1;
    if (c == 'b' ||c == 'e' ||c == 'h' ||c == 'k' ||c == 'n' ||
       c == 'q' ||c == 't' ||c == 'w' ||c == 'z' ||c == ',')
       return 2;
    return 3;
  }
}

