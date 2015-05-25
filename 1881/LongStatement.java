/*
 * Timus OJ - 1881
 * Long problem Statement
 */

import java.io.*;
import java.util.*;

class LongStatement{
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int pages = 1;
    int lines = 1;
    int currentLine = 0;
    while (n-- > 0) {
     	String s = f.readLine();
     	currentLine += s.length() + 1;
     	if (currentLine > w + 1) {
       		lines++;
       		currentLine = s.length()+1;
     	}
     	if (lines > h) {
       		pages++;
       		lines = 1;
     	}
    }
    System.out.println(pages);
  }
}
