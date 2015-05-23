/*
 * Timus OJ - 1100
 * Final standings
 */
import java.io.*;
import java.util.*;

public class Standings {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[][] standings = new int[n][2];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      for (int j = 0; j < 2; j++) {
        standings[i][j] = Integer.parseInt(st.nextToken());
      }
    }
   Arrays.sort(standings, new TwoDcomp());
   for (int i = 0; i < n; i++) {
    for (int j = 0; j < 2; j++) {
      System.out.print(standings[i][j] + " ");
    }
    System.out.println();
   }
   f.close();
   System.exit(0);
  }
}
class TwoDcomp implements Comparator<int[]> {
   public int compare(int[] a, int[] b) {
    return b[1] - a[1]; 
  }
  public boolean equals(int[] a, int[] b) {
    return b[1] == a[1];
  }
}
