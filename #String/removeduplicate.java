public class removeduplicate {
    public static  String removeduplicate(String str){
        StringBuilder sb=new StringBuilder(" ");
      
        boolean map[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            
            if(map[str.charAt(i)-'a']==false){
                sb.append(str.charAt(i));
                map[str.charAt(i)-'a']=true;
            }
        }
        return sb.toString();
    }
   public static void main(String args[]){
    String str="bcabc";
   System.out.print( removeduplicate(str));
   } 
}
