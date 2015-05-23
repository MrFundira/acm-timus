/*
 * Timus OJ - 1581
 * Teamwork
 */
import java.io.*;
import java.util.*;

public class Teamwork {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    StringTokenizer st = new StringTokenizer(f.readLine());
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }
    int current = 1;
    int i = 1;
    int j = 0;
    while (i < n) {
      if (nums[i] == nums[j]) {
        current++;
      }
      else {
        System.out.print(current + " " + nums[j] + " ");
        current = 1;
        j = i;
      }
      i++;
    }
    System.out.println(current + " " + nums[j] + " ");
    f.close();
    System.exit(0);
  }
}
