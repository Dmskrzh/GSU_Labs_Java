import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String poem = """
                The world was on fire and no one could save me but you
                It's strange what desire will make foolish people do
                I never dreamed that I'd meet somebody like you
                And I never dreamed that I'd lose somebody like you""";
        String[] words = poem.split("\\W+");

        for (String word : words) {
            word = word.toLowerCase();
            String regex = "[eyuioa]";
            boolean firstSymbolMatches = Pattern.matches(regex, String.valueOf(word.charAt(0)));
            boolean lastSymbolMatches = Pattern.matches(regex, String.valueOf(word.charAt(word.length() - 1)));
            if (firstSymbolMatches && lastSymbolMatches) {
                count++;
            }
        }
        System.out.println("Number of words that begin and end with a vowel: " + count);
    }
}