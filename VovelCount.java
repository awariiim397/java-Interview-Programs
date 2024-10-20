import java.util.Scanner;

class VowelCounterAndPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        
        int vowelCount = 0;
        System.out.println("Words with vowels:");
        for (String word : words) {
            if (hasVowel(word)) {
                System.out.println(word);
                vowelCount++;
            }
        }
        
        System.out.println("Total vowels in the sentence: " + vowelCount);
    }
    
    public static boolean hasVowel(String word) {
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) >0) {
                return true;
            }
        }
        return false;
    }
}
