/*
 * Timus - 2001
 * Mathematicians and Berries
 */

import java.io.*;
import java.util.*;

public class Berries {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int[] a = new int[3];
    int[] b = new int[3];
    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      a[i] = Integer.parseInt(st.nextToken());
      b[i] = Integer.parseInt(st.nextToken());
    }
    System.out.println((a[0] - a[2]) + " " + (b[0] - b[1]));
    f.close();
    System.exit(0);
  }
}
