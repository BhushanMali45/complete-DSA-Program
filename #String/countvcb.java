public class countvcb {
  
    
public static void count(String str){

    //lowercase
    str=str.toLowerCase();

    int vowel=0;
    int consonant=0;
    int blanck_space=0;
    for(int i=0;i<str.length();i++){

        if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'){
            vowel++;
        }
        else if(str.charAt(i)== ' '){
                 blanck_space++;    
        }
        else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            consonant++;
        }

    }

    System.out.println("vowels is "+vowel);
    System.out.println(consonant);
    System.out.println(blanck_space);
}

    public static void main(String args[]){
     String str="India won the cricket match";
     count(str);


    }

    
}
