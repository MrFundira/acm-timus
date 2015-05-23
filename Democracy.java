/*
 * Timus OJ - 1025
 * Democracy in Danger
 */
import java.io.*;
import java.util.*;

public class Democracy {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    StringTokenizer st = new StringTokenizer(f.readLine());
    int[] groups = new int[n];
    for (int i = 0; i < n; i++) {
      groups[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(groups);
    int total = 0;
    for (int i = 0; i < (n + 1) / 2; i++) {
      total += groups[i] / 2 + 1;
    }
    System.out.println(total);
    f.close();
    System.exit(0);
  }
}
