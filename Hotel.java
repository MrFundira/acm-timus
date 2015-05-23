/*
 * Timus OJ - 1319
 * Hotel
 */
import java.io.*;
import java.util.*;

public class Hotel {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[][] grid = new int[n][n];
    int iStart = 0;
    int jStart = n - 1;
    int num = 1;
    int i, j;
    while (jStart >= 0) {
      j = jStart;
      i = iStart;
      while (j < n) {
        grid[i][j] = num;
        num++;
        i++;
        j++;
      }
      jStart--;
    }
    jStart = 0;
    iStart = 1;
    while (iStart < n) {
      i = iStart;
      j = jStart;
      while (i < n) {
        grid[i][j] = num;
        num++;
        i++;
        j++;
      }
      iStart++;
    }
    for (int k = 0; k < n; k++) {
     for (int m = 0; m < n; m++) {
       System.out.print(grid[k][m] + " ");
     }
     System.out.println();
    }
  }
}
