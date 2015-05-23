/*
 * Timus OJ - 1876
 * Centipede's Morning
 */
import java.io.*;
import java.util.*;

public class Centipede {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int left = Integer.parseInt(st.nextToken());
    int right = Integer.parseInt(st.nextToken());
    int ans = Math.max(2 * left + 39, 2* right + 40);
    System.out.println(ans);
    f.close();
    System.exit(0);
  }
}
