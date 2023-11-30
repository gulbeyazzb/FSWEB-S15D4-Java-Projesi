import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {
    public static void main(String[] args) {
        String sentence = "I did, did I?".toLowerCase().replaceAll("[.,!?\"]", "").replace(" ", "");

        Queue<Character> queueChar = new LinkedList<>();
        Stack<Character> stackChar = new Stack<>();

        for (int i = 0; i < sentence.length(); i++) {
            stackChar.push(sentence.charAt(i));
        }

        for (int i = sentence.length() - 1; i >= 0; i--) {
            queueChar.add(sentence.charAt(i));
        }

        while (!queueChar.isEmpty()) {
            if (queueChar.remove().equals(stackChar.pop())) {
                System.out.println(sentence+" is palindrome");
            }else{
                System.out.println(sentence+" is not palindrome");
            }
        }
    }
}
