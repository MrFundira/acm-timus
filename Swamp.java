import java.io.*;
import java.util.*;

public class Swamp {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int unused = 0;
    int survived = 0;
    st = new StringTokenizer(f.readLine());
    while (n-- > 0) {
      int boom = Integer.parseInt(st.nextToken());
      unused += Math.max(boom - k, 0);
      survived += Math.max(k - boom, 0);
    }
    System.out.println(unused + " " + survived);
    f.close();
    System.exit(0);
  }
}
