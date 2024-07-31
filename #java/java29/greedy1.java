import java.util.*;

public class greedy1 {

  public static void main(String args[]) { //O{n}
    int start[] = { 1, 3, 0, 5, 8, 5 };
    //end time base sorted
    int end[] = { 2, 4, 6, 7, 9, 9 };

    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    //1st activity
    maxAct = 1;
    ans.add(0);

    //remaining activity

    int lastend = end[0];
    for (int i = 1; i < end.length; i++) {
      if (start[i] >= lastend) {
        //select activity
        maxAct++;
        ans.add(i);
        lastend = end[i];
      }
    }

    System.out.println("max activities " + maxAct);

    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");
    }
  }
}
