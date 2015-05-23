import java.io.*;
import java.util.*;

public class Stacks {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    Stack<Integer>[] stacks = (Stack<Integer>[]) new Stack[1000];
    for (int i = 0; i < 1000; i++) {
      stacks[i] = new Stack<Integer>();
    }
    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      String op = st.nextToken();
      if (op.equals("PUSH")) {
        stacks[Integer.parseInt(st.nextToken()) - 1].push(Integer.parseInt(st.nextToken()));
      }
      else {
        System.out.println(stacks[Integer.parseInt(st.nextToken()) - 1].pop());
      }
    }
    f.close();
    System.exit(0);
  }
}


class Stack<Item> implements Iterable<Item> {
  private Node first; // top of stack
  private int N;

  private class Node { // nested class to define nodes
    Item item;
    Node next;
  }

  

  public boolean isEmpty() {
    return N == 0; 
  }

  public int size() {
    return N; 
  }

  public void push(Item item) {
    // Add item to top of the stack.
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    N++;
  }

  public Item pop() {
    // Remove the item from the top of the stack.
    Item item = first.item;
    first = first.next;
    N--;
    return item;
  }

  public Item peek() {
   return first.item; 
  }

  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator<Item> {
    private Node current = first;
    public boolean hasNext() {
      return current != null;
    }

    public void remove() {}
  
    public Item next() {
      Item item = current.item;
      current = current.next;
      return item;
    }
  }
}
