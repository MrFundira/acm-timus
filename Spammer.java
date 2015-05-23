/*
 * Timus OJ - 1496
 * Spammer
 */

import java.io.*;
import java.util.*;

public class Spammer {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    String[] stores = new String[n];
    for (int i = 0; i < n; i++) {
      stores[i] = f.readLine();
    }
    Arrays.sort(stores);
    HashSet<String> duplicates = new HashSet<String>();
    for (int i = 1;  i< n; i++) {
     if (stores[i].equals(stores[i-1]))
       duplicates.add(stores[i]);
    }
    for (String s: duplicates)
      System.out.println(s);
    f.close();
    System.exit(0);
  }
}
