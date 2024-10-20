import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 class WriteFile{
 public static void main (String args[]){
  
try{
File file=new File("Mahesh Awari.txt");
file.write("my name is mahesh awari ");
file.close();

System.out.println("file wrote Successfully");



}catch(IOException e){
System.out.println("error occured");
e.printStackTrace();
  }
 }
} 