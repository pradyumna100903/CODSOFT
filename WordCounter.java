import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Welcome To Word Counter"); // Displaying the Message for Word Counter 
        System.out.print("Please Enter a sentence or paragraph: ");

        String input = scanner.nextLine(); // take input string from user

        int wordCount = countWords(input);

        System.out.println("Total word count in the given input Sentence / Paragraph: " + wordCount);

        scanner.close();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Found a letter, indicating the start of a word
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                // Found a non-letter character, indicating the end of a word
                inWord = false;
            }
        }

        return wordCount;
    }
  }








