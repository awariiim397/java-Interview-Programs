class ReverseString1 {
public static void main(String args[]){
  String str="my name is mahesh";
String[] words=str.split("\\s+");
StringBuilder sb=new StringBuilder();

for(int i=words.length-1;i>=0;i--){

 sb.append(words[i]);}
String op=sb.toString();

System.out.println(op);
}
}
