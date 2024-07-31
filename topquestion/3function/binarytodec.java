public class binarytodec {


    public static void bintodec(int binum){
int mynum=binum;
int pow=0;
int decNum=0;

while(binum!=0){  //>
int lastdigit=binum%10;
 decNum=decNum+(lastdigit * (int)Math.pow(2, pow));
 pow++;
binum=binum/10;
}


System.out.println("decimal no is"+mynum+"="+decNum);


    }
   public static void main(String args[]){

bintodec(101);
   } 
}
