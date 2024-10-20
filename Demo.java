 class Student{
int id;
String name;
Student(int i,String n){
 id=i;
name=n;
}
void display();
System.out.println(id+" "+name);
}
public static void main(String[] args){
Student s1=new Student(111 "Mahesh");
Student s2=new Student(112,"akash");
Student s3=new Student(113,"Manoj");
s1.display();
s2.display();
s3.display();
}