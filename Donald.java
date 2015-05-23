/*
 * Timus OJ - 2023
 * Donald the Postman
 */

import java.io.*;
import java.util.*;

public class Donald {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    String[] boxes = new String[n+1];
    boxes[0] = "A";
    for (int i = 1; i < n + 1; i++)
      boxes[i] = f.readLine();
    int total = 0;
    for (int i = 0; i < n; i++) {
     total += move(boxes, i, i + 1);
    }
    System.out.println(total);
    f.close();
    System.exit(0);
  }
  static int move(String[] a, int i, int j) {
    if ("AOPR".contains(a[j].substring(0,1)) && "AOPR".contains(a[i].substring(0,1))
       || "BMS".contains(a[j].substring(0,1)) && "BMS".contains(a[i].substring(0,1))
       || "DGJKTW".contains(a[j].substring(0,1)) && "DGJKTW".contains(a[i].substring(0,1)))
      return 0;
    if ("AOPR".contains(a[i].substring(0,1))) {
      if ("BMS".contains(a[j].substring(0, 1)))
        return 1;
      return 2;
    }
    if ("BMS".contains(a[i].substring(0, 1))) {
      return 1;
    }
    // else
    if ("AOPR".contains(a[j].substring(0, 1)))
      return 2;
    return 1;
  }
}
