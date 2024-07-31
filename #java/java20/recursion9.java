public class recursion9 {

public static void removeduplicates(String str,int idx, StringBuilder newstr,boolean map){



    if(idx == str.length()){
        System.out.println(newstr);
        return;
    }
    
    //kaam
   char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
        //duplicate t

        removeduplicates(str, idx+1, newstr, map);
    }
    else{
        map[currChar -'a']=true;
        removeduplicates(str, idx+1, newstr.append(currChar), map);
    }

}

    public static void main(String args[]){
String str="appnacollege";
removeduplicates(str,0, new StringBuilder(""), new boolean[26]);
    }
}
