import java.util.*;

public class queue6 {

  static class Queue {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
      return s1.isEmpty() && s2.isEmpty();
    }

    // add  //O(1)
    public static void add(int data) {
      s1.push(data);
    }

    // remove O(1) amortized
    public static int remove() {
      if (isEmpty()) {
        System.out.println("queue empty");
        return -1;
      }
      if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
          s2.push(s1.pop());
        }
      }
      return s2.pop();
    }

    // peek 0(1)
    public static int peek() {
      if (isEmpty()) {
        System.out.println("queue empty");
        return -1;
      }
      if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
          s2.push(s1.pop());
        }
      }
      return s2.peek();
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
