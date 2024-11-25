import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

    public static String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                continue;
            int start = i;
            while(i < s.length() && s.charAt(i) != ' ')
                i++;
            if(result.length() == 0)
                result.insert(0,s.substring(start,i));
            else result.insert(0," ").insert(0,s.substring(start,i));
        }
        return result.toString();
    }

    public static String reverseWordsUsingInbuiltFunctions(String s){

        String[] words = s.split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        String s = "  Java ebook ";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);

        String s1 = reverseWordsUsingInbuiltFunctions(s);
        System.out.println(s1);

    }
}
