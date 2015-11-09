import java.io.*;
import java.util.*;

public class BraveBalloonists
{
  public static void main(String[] args) throws IOException
  {
    new BraveBalloonists().run();
  }

  StreamTokenizer in;
  PrintWriter out;
  ArrayList<Integer> primes;

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
    int t = 10;
    int[] factors = new int[10001];
    primes = getPrimes();
    while (t-- > 0)
    {
      int n = nextInt();
      merge(factors, primeFactors(n));
    }
    int result = 1;
    for (int i = 0; i < 10001; i++)
    {
      result = (result * (factors[i] + 1)) % 10;
    }
    out.print(result);
  }

  void merge(int[] a, int[] b)
  {
    for (int i = 0; i < 10001; i++)
    {
      a[i] += b[i];
    }
  }

  int[] primeFactors(int n)
  {
    int total = 1;
    int[] result = new int[10001];
    for (int p: primes)
    {
      if (p > n)
        break;
      while (n % p == 0)
      {
        result[p]++;
        n /= p;
      }
    }
    return result;
  }

  ArrayList<Integer> getPrimes()
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean[] sieve = getSieve();
    for (int i = 2; i <= 10000; i++)
    {
      if (!sieve[i])
      {
        list.add(i);
      }
    }
    return list;
  }

  boolean[] getSieve()
  {
    int n = 10001;
    boolean[] a = new boolean[n];
    for (int i = 2; i <= 100; i++)
    {
      if (!a[i])
      {
        for (int j = i * i; j < n; j += i)
        {
          a[j] = true;
        }
      }
    }
    return a;
  }
}
