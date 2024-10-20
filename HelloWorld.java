 import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld
{

 public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     String j;
     ArrayList l=new ArrayList();
     for(int i=0;i<6;i++)
     {  j=sc.nextLine();
         l.add(j);
     }
    System.out.println("Hello World"+l);
 }
}