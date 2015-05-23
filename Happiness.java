/*
 * Timus OJ - 1493
 * One step from happiness
 */
import java.io.*;
import java.util.*;

public class Happiness {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int in = Integer.parseInt(f.readLine());
    System.out.println((isLucky(in + 1) || isLucky(in - 1)) ? "Yes" : "No");
    f.close();
  }
  public static boolean isLucky(int n) {
    int a = 0;
    for (int i = 0; i < 3; i++) {
      a += n % 10;
      n /= 10;
    }
    int b = 0;
    for (int i = 0; i < 3; i++) {
      b += n % 10;
      n /= 10;
    }

    return a == b;
  }
}
