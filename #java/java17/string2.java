public class string2 {
   
    //FIND SHORETESH PATH
    public static float shortestpath(String path){
int x=0,y=0;
for(int i=0;i<path.length();i++){
    char dir=path.charAt(i);

    //south
    if(dir=='S'){
        y--;
    }

    //north
   else if(dir=='N'){
        y++;
    }


    //WEST
  else if(dir=='W'){
        x--;
    }

    //south
    if(dir=='E'){
        x++;
    }
}
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);


    }


    public static void main(String args[]){
        String path="WNEENESENNN";
System.out.println(shortestpath(path));
    }
}
