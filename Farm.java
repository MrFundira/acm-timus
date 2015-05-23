/*
 * Timus OJ - 1349
 * Farm
 */

import java.io.*;
import java.util.*;

public class Farm {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    if (n == 1)
      System.out.println("1 2 3");
    else if(n == 2)
      System.out.println("3 4 5");
    else
      System.out.println(-1);
    f.close();
  }
}
