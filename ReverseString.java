public class ReverseString {
    public static void main(String[] args) {
        String input = "my   name    is    Ankush";
        String[] words = input.split("\\s+"); 
        StringBuilder rev = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]).append(" ");
        }
        
        String output = rev.toString();//.trim(); // Remove trailing space
        System.out.println(output);
    }
}
