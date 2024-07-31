import java.util.*;
public class array3{

    public static void update(int marks[] ,int notchangleble){

        for (int i=0;i<marks.length;i++){
  marks[i]=marks[i]+1;
}
    }



    public static void main(String args[]){

// int marks []=new int [50];

int marks[]={45,90,96};
int notchangleble=45;
update(marks,notchangleble);
System.out.println(notchangleble);



//print our marks
for (int i=0;i<marks.length;i++){
    System.out.print(marks[i]+" ");
}
System.out.println();
    }
}