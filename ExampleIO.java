import java.io.*;
import java.util.*;

public class ExampleIO
{
  public static void main(String[] args) throws IOException
  {
    new ExampleIO.run();
  }

  StreamTokenizer in;
  PrintWriter out;

  String next() throws IOException
  {
    in.nextToken();
    return in.sval;
  }

  int nextInt() throws IOException
  {
    in.nextToken();
    return (int)in.nval;
  }

  void run() throws IOException
  {
    in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    solve();
    out.flush();
  }

  void solve() throws IOException
  {

  }
}
