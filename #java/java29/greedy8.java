
import java.util.*;
public class greedy8 {
    

    public static void main(String args[]){
        int n=4,m=6;

        Integer costver[]={2,1,3,1,4};//m-1
        Integer costhor[]={4,1,2};//n-1

        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());

        int h=0,v=0;//konsa horizontal cut or v=konsa vertical cut
        int hp=1,vp=1;//pieces
        int cost =0;


        while(h<costhor.length && v<costver.length){
          //vertical cost < hor cost

          if(costver[v] <= costhor[h]){
            //horizontal cut
            
            cost+= (costhor[h]*vp);
            hp++;
            h++;
          }
          else{
            cost+= (costver[v]*hp);
            vp++;
            v++;
          }

        }

        while(h<costhor.length){
             cost+= (costhor[h]*vp);
            hp++;
            h++;
        }

        while(v<costver.length){
           cost+= (costver[v]*hp);
            vp++;
            v++; 
        }


        System.out.println("min cost "+cost);
    }
}
