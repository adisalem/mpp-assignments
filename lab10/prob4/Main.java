import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "lambda", "test", "code", "programming");
        
        int count1 = main.countWords(words, 'a', 'e', 4);
        System.out.println("Words with length 4, containing 'a', not containing 'e': " + count1);
        
        int count2 = main.countWords(words, 'o', 'x', 5);
        System.out.println("Words with length 5, containing 'o', not containing 'x': " + count2);
        
        int count3 = main.countWords(words, 'r', 'z', 6);
        System.out.println("Words with length 6, containing 'r', not containing 'z': " + count3);
    }
    
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) != -1)
                .filter(word -> word.indexOf(d) == -1)
                .count();
    }
}
