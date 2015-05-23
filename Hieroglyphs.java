import java.io.*;
import java.util.*;

public class Hieroglyphs {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    String[] input = new String[n];
    for (int i = 0; i < n; i++) {
      input[i] = f.readLine();
    }
    char key = f.readLine().charAt(0);
    for (String s : input) {
      if (s.charAt(0) == key)
       System.out.println(s);
    }
    f.close();
  }
}
