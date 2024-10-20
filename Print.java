//import java.util.*;
import java.util.ArrayList;
class Print{
 String name;
 int rno;
 Print(String n,int no){
name=n;
rno=no;
}
public String toString(){
return "Name:"+name+ " && "+" Roll No:"+rno;
}
public static void main(String args[]){
 ArrayList<Print> al=new ArrayList<Print>();
 
Print p1=new Print("Mahesh",101);
Print p2=new Print("Akash",102);
Print p3=new Print("Akshay",103);

al.add(p1);
al.add(p2);
al.add(p3);
for(Print p:al)
System.out.println(p);
}
}