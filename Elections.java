/*
 * Timus OJ - 1263
 * Elections
 */
import java.io.*;
import java.util.*;

public class Elections {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] candidates = new int[n];
    for (int i = 0; i < m; i++) {
     candidates[Integer.parseInt(f.readLine()) - 1]++;
    }
    for (int i = 0; i < n; i++) {
     System.out.printf("%.2f%%\n", (candidates[i] * 100.0 / m));
    }
    f.close();
    System.exit(0);
  }
}
