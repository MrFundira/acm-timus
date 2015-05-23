import java.io.*;
import java.util.*;

public class Copying {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int comps = 1;
    int time = 0;
    int increase = 1;
    while (comps < n && increase < k) {
      comps += increase;
      increase = Math.min(k, comps);
      time++;
    }
    time += (int) Math.ceil((n - comps) * 1.0 / k);
    System.out.println(time);
    f.close();
    System.exit(0);
  }
}
