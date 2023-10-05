import java.util.Scanner;

public class studentmarks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int sub1,sub2,sub3;
  // System.out.println("enter total marks");
   //int total =sc.nextInt();
   System.out.println("enter marks 1 ");
   sub1=sc.nextInt();
     System.out.println("enter marks 2 ");
   sub2=sc.nextInt();
   System.out.println("enter marks 3 "); 
   sub3=sc.nextInt();

  


  
float marks=sub1+sub2+sub3;
float percentage=(marks/300)*100;

if(percentage>=40.0 && sub1>=33 && sub1>=33 && sub3>=33){
System.out.println("you passed the exam with percentage : "+ percentage+" %");
}
else
{ System.out.println("percentage is :"+ percentage);
    System.out.println("you failed the exam");
}

}
}