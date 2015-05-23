/*
 * Timus OJ - Sequence Median
 * 
 */

import java.io.*;
import java.util.*;

public class Median {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(f.readLine());
    }
    Arrays.sort(nums);
    if (n % 2 == 1) {
      System.out.println(nums[n / 2]);
    }
    else {
      double mean = (nums[n / 2] + nums[n / 2 - 1])/2.0;
      System.out.println(mean);
    }
    f.close();
    System.exit(0);
  }
}
