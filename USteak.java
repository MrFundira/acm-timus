import java.io.*;
import java.util.*;

public class USteak {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int result;
    if (k > n)
      result = 2;
    else if ((2 * n) % k > 0)
      result = 2 * n / k + 1;
    else
      result = 2 * n / k;
    System.out.println(result);
    f.close();
    System.exit(0);
  }
}
