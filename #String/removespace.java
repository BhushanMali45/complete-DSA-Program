public class removespace {
    


    public static String removevowel(String str){
        StringBuilder sb=new StringBuilder(" ");
 
        for(int i=0;i<str.length();i++){

        if (str.charAt(i) == ' ')
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
String str="I am very happy today";
System.out.print(removevowel(str));

    }
}

