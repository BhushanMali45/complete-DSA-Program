
import java.util.*;
public class greedy5 {
    public static void main(String args[]){//nlogn
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

        int chainlen=1;
        int chainend=pairs[0][1];//last selected pair


        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainend){
                chainlen++;
                chainend=pairs[i][1];
            }
        }

        System.out.println(("max chain length "+chainlen));
    }
}
