import java.io.File;
import java.io.IOException;
 class CreateFile{
 public static void main (String args[]){
  
try{
File file=new File("Mahesh Awari.txt");
if(file.createNewFile()){
System.out.println("file is created Successfully");
System.out.println(file.getName());

}else{
System.out.println("File already exist");
System.out.println(file.getName());
System.out.println(file.length());
System.out.println(file.getAbsolutePath());
System.out.println(file.list());
System.out.println(file.delete());
System.out.println(file.canRead());



}
}catch(IOException e){
System.out.println("error occured");
e.printStackTrace();
  }
 }
} 