public class k {
    //remove duplicates from string 


    public static void removeDuplicate(String str ,int idx, StringBuilder newstr,boolean map[]){


        if(idx==str.length()){
             System.out.print(newstr);
             return;
        }


        

        // //kaam
        char currchar=str.charAt(idx);
        if(map[currchar -'a']==true){
        //duplicates
        removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[currchar -'a']=true;
            removeDuplicate(str, idx+1, newstr.append(currchar), map);

        }
    }
    public static void main(String args[]){
      String str="bhushan";

      removeDuplicate(str, 0, new StringBuilder(" "), new boolean[26]);

      
    
    }
}
























