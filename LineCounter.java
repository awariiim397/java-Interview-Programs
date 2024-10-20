public class LineCounter {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph.\nIt spans over multiple lines.\nEach line is separated by a newline character.";
        int lineCount = countLines(paragraph);
        System.out.println("Number of lines in the paragraph: " + lineCount);
    }

    public static int countLines(String text) {
        int lines = 1; // Start with 1 assuming there's at least one line
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                lines++;
            }
        }
        return lines;
    }
}
