  class Thread1{
// Main method  
public static void main(String argvs[])  {
for(i=0;i<10;i++)(
public void run(){
System.out.println(str);
  }
  
Thread t= new Thread("My first thread");  
  
t.start();  
String str = t.getName();  
System.out.println(str);  
}  
}  