/*
 * Timus OJ - 1877
 * Bicycle Codes
 */

import java.io.*;
import java.util.*;

public class BicycleCodes {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(f.readLine());
    int b = Integer.parseInt(f.readLine());
    if (a % 2 == 0 || b % 2 == 1)
       System.out.println("yes");
    else
       System.out.println("no");
    f.close();
    System.exit(0);
  }
}
