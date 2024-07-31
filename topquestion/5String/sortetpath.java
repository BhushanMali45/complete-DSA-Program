public class sortetpath {


     public static float getsortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dre=path.charAt(i);

            if(dre=='N'){
                y++;
            }else if(dre=='S'){
                        y--;

            }else if(dre=='W'){
                 x--;

            }else{
                x++;
            }
        }


        float x2=x*x;
        float y2=y*y;
        return (float)Math.sqrt(x2+y2);

     }
    public static void main(String args[]){
        String path="WNEENESENNN";
        float ans =getsortestpath(path);
        System.out.println(ans);
    }
}
