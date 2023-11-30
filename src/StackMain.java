import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
//        String sentence = "I did, did I?".toLowerCase().replaceAll("[.,!?\"]", "").replace(" ", "");
//         String sentence = "Racecar".toLowerCase().replaceAll("[.,!?\"]", "").replace(" ","");
//        String sentence = "Was it a car or a cat I saw ?".toLowerCase().replaceAll("[.,!?\"]", "").replace(" ","");
        String sentence = "Hello".toLowerCase().replaceAll("[.,!?\"]", "").replace(" ","");
//
        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < sentence.length(); i++) {
            chars.push(sentence.charAt(i));
        }

        String reverseText = "";

        while (!chars.isEmpty()) {
            reverseText = reverseText+chars.pop();
        }


        if(sentence.equals(reverseText)){
            System.out.println(sentence+" is palindrome");
        }else{
            System.out.println(sentence+" is not palindrome");
        }
    }
}
