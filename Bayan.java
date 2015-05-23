/*
 * Timus OJ - 1563
 * Bayan
 */

import java.io.*;
import java.util.*;

public class Bayan {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    String[] stores = new String[n];
    for (int i = 0; i < n; i++) {
      stores[i] = f.readLine();
    }
    Arrays.sort(stores);
    int count = 0;
    for (int i = 1;  i< n; i++) {
     if (stores[i].equals(stores[i-1]))
       count++;
    }
    System.out.println(count);
    f.close();
    System.exit(0);
  }
}
