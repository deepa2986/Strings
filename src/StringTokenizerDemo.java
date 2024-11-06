import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String s = "Thin is an amazing view";
        StringTokenizer tokenizer = new StringTokenizer(s," ");
        while (tokenizer.hasMoreTokens()){
           String word =  tokenizer.nextToken();
            System.out.println(word);
        }
    }
}
