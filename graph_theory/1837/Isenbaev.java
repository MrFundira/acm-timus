import java.io.*;
import java.util.*;

public class Isenbaev
{
  public static void main(String[] args) throws IOException
  {
    new Isenbaev().run();
  }

  StreamTokenizer in;
  PrintWriter out;
  HashMap<String, LinkedList<String>> graph;
  int n;

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
    graph = new HashMap<String, LinkedList<String>>();
    solve();
    out.flush();
  }

  void solve() throws IOException
  {
    n = nextInt();
    for (int i = 0; i < n; i++) {
      String a = next();
      String b = next();
      String c = next();
      addEdge(a, b);
      addEdge(b, a);
      addEdge(a, c);
      addEdge(c, a);
      addEdge(b, c);
      addEdge(c, b);
    }
    ArrayList<String> contestants = new ArrayList<String>(graph.keySet());
    Collections.sort(contestants);
    if (!graph.containsKey("Isenbaev"))
    {
      for (String contestant: contestants)
      {
        out.println(contestant + " undefined");
      }
    }
    else {
      HashMap<String, Integer> distance = dijkstra(contestants);
      for (String contestant: contestants)
      {
        out.println(contestant + " " + (distance.get(contestant) != Integer.MAX_VALUE ?
              distance.get(contestant) : "undefined"));
      }
    }
  }

  void addEdge(String name1, String name2)
  {
    if (graph.containsKey(name1)) {
      graph.get(name1).add(name2);
    }
    else {
      graph.put(name1, new LinkedList<String>());
      graph.get(name1).add(name2);
    }
  }

  HashMap<String, Integer> dijkstra(ArrayList<String> nodes) 
  {
    HashMap<String, Integer> distance = new HashMap<String, Integer>();
    for (String node: nodes)
    {
      distance.put(node, Integer.MAX_VALUE);
    }
    distance.put("Isenbaev", 0);
    HashSet<String> visited = new HashSet<String>();
    int i = 0;
    while (visited.size() < n)
    {
      String minUnvisited = findMin(distance, visited);
      for (String adj : graph.get(minUnvisited))
      {
        if (distance.get(adj) > distance.get(minUnvisited))
        {
          distance.put(adj, distance.get(minUnvisited) + 1);
        }

      }
      visited.add(minUnvisited);
      i++;
    }
    return distance;
  }

  String findMin(HashMap<String, Integer> dist, HashSet<String> visited)
  {
    int min = Integer.MAX_VALUE;
    String minStr = null;
    for (String node: dist.keySet()) {
      int current = dist.get(node);
      if (current < min && !visited.contains(node))
      {
        min = current;
        minStr = node;
      }
    }
    return minStr;
  }

}
