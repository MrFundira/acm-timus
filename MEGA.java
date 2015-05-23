/*
 * Timus - 1787
 * Turn for MEGA
 */
import java.io.*;
import java.util.*;

public class MEGA {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int sum = 0;
    st = new StringTokenizer(f.readLine());
    for (int i = 0; i < n; i++) {
      
      sum += Integer.parseInt(st.nextToken()) - k;
      sum = Math.max(0, sum);
    }
    System.out.println(sum);
    f.close();
    System.exit(0);
  }
}
