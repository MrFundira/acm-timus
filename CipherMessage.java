/*
 * Timus - 1654
 * Cipher Message
 */
import java.io.*;
import java.util.*;

public class CipherMessage {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder s = new StringBuilder(f.readLine());
    decode(s);
  }
  private static void decode(StringBuilder s) {
    ArrayList<Character> ls = new ArrayList<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (ls.size() > 0 && ls.get(ls.size()-1) == s.charAt(i))
        ls.remove(ls.size() - 1);
      else
        ls.add(s.charAt(i));
    }
    for (char c: ls) {
      System.out.print(c);
    }
    System.out.println();
  }
} 
