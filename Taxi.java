/*
 * Timus OJ - 1607
 * Taxi
 */
import java.io.*;
import java.util.*;

public class Taxi {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    while (a < c) {
      a += b;
      c -= d;
    }
    System.out.println(a);
    f.close();
  }
}
