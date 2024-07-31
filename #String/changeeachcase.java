public class changeeachcase {

    public static String changeeachcase(String str){
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<str.length();i++){

        int ascii=(int)str.charAt(i);

        if(ascii >=65 && ascii <=90){//upper
            sb.append(Character.toLowerCase((char)ascii));

        }
        else if(ascii >=97 && ascii <=122){
            sb.append(Character.toUpperCase((char)ascii));
        }

        else if(str.charAt(i)== ' ')
        sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String str="take u forward IS Awesom";
        System.out.print(changeeachcase(str));
    }
}
