import java.io.*;
import java.util.*;

public class PenaltyTime {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int t1 = Integer.parseInt(st.nextToken());
    int t2 = Integer.parseInt(st.nextToken());
    int total = 0;
    st = new StringTokenizer(f.readLine());
    for (int i = 0; i < 10; i++) {
      total += 20 * Integer.parseInt(st.nextToken());
    }
    if (t2 - total < t1)
      System.out.println("Dirty debug :(");
    else
      System.out.println("No chance.");
    f.close();
  }
}
