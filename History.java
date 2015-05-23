/*
 * Timus OJ - 1196
 * History Exam
 */

import java.io.*;
import java.util.*;

public class History {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int count = 0;
    HashSet<Integer> prof = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
      prof.add(Integer.parseInt(f.readLine()));
    }
    int m = Integer.parseInt(f.readLine());
    while (m-- > 0) {
      if (prof.contains(Integer.parseInt(f.readLine())))
        count++;
    }
    System.out.println(count);
  }
}
