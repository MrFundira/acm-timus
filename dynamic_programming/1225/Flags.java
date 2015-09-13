import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flags {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(solve(n));
  }

  public static long solve(int n) {
    if (n <= 2) {
      return 2;
    }
    return fib(n) + fib(n-1) + fib(n-2);
  }

  public static long fib(int n) {
    // looks complicated, but this is just an analytic algo for the fib sequence
    // works up to n = 92, then goes out of range
    // S/O to rosetta code
    double p = (1 + Math.sqrt(5)) / 2;
    double q = 1 / p;
    return (long) ((Math.pow(p, n) + Math.pow(q, n)) / Math.sqrt(5));
  }
}
