public class removebrackets {
    
    
    public static String removebrackets(String str){
        StringBuilder sb=new StringBuilder(" ");
 
        for(int i=0;i<str.length();i++){

        if (str.charAt(i) == '(' ||  str.charAt(i) == ')' )
        {
            continue;
        }
        else{
             sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
    public static void main(String args[]){
String str="a+((b-c)+d)";
System.out.print(removebrackets(str));


    }
}




