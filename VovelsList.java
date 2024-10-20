import java.io.*;
import java.util.*;
class VovelsList{
    public static void main(String[] args)throws IOException
    {
        String s = "my name is ";
       
        String[] str=s.split(" ");
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
           for(int j=0;j<str[i].length();j++){
              if(vowels.contains(str.charAt(i))){
                  count++;
                System.out.println(str[i]);
            }
        }
}
 
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }
}