

public class back2 {


    public static void findsubstring(String Str,String ans,int i){
        //base case

        // if(i==Str.length()){
        //  System.out.println(ans);
        //  return;
        // }




        //for null disl pahije ,manun

        if(i==Str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }



        //recursion
        //yes choice
        findsubstring(Str, ans+Str.charAt(i), i+1);

        //no
        findsubstring(Str, ans, i+1);
    }
   public static void main(String args[]){
    String str="abc";
    findsubstring(str, "", 0);

   }
}
