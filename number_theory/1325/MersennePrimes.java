import java.io.*;
import java.util.*;

public class MersennePrimes
{
  public static void main(String[] args) throws IOException
  {
    new MersennePrimes().run();
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
    int[] primes = {2, 3, 5, 7, 13, 17, 19, 31, 61, 89, 107, 127, 521, 607,
      1279, 2203, 2281, 3217, 4253, 4423, 9689, 9941, 11213, 19937, 21701, 
      23209, 44497, 86243, 110503, 132049, 216091, 756839, 859433, 1257787, 
      1398269, 2976221, 3021377, 6972593, 13466917, 20996011, 24036583, 
      25964951, 30402457, 32582657, 37156667, 42643801, 43112609, 57885161};
    int t = nextInt();
    while (t-- > 0) 
    {
      int n = nextInt();
      out.println(primes[n-1]);
    }
  }
}
