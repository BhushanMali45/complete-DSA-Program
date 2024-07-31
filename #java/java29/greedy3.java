import java.util.*;

public class greedy3 {

  public static void main(String args[]) { //O{nlogn}
    int val[] = { 60, 100, 120 };
    int weight[] = { 10, 20, 30 };
    int w = 50;
    //ratio sorted
    double ratio[][] = new double[val.length][2];
    //0th col ==> idx; 1st col==>items ratio

    for (int i = 0; i < val.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double) weight[i];
    }

    //asc sorting
    //lamda function  __> shortform
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    //ending time

    int capacity = w;
    int finalvalues = 0;
    //descending sathi ult loop
    for (int i = ratio.length - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      if (capacity >= weight[idx]) { //include full item
        finalvalues += val[idx];
        capacity -= weight[idx];
      } else { //include fractional item
        finalvalues += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }

    System.out.println("final values" + finalvalues);
  }
}
