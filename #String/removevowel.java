public class removevowel {

    public static String removevowel(String str){
        StringBuilder sb=new StringBuilder(" ");
 
        for(int i=0;i<str.length();i++){

        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
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
