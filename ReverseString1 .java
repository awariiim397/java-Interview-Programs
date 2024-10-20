class ReverseString1 {
public static void main(String args[]){
  String str="my name is mahesh";
String[] words=str.toSplit("\\s+");
for(int i=words.length-1;i>=0;i--){

StringBuilder sb=new StringBuilder();
 sb.append(words[i]);}
String op=sb.toString();

System.out.println(op);
}
}
