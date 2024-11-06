import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachChar {

    public static void countOccurrenceOfEachChar(String s){
        Map<Character,Integer> charCountMap = new HashMap<>();
        for(Character ch : s.toCharArray()){
            charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
        }
        System.out.println(charCountMap);
    }
    public static void main(String[] args) {

        String s = "java";
        countOccurrenceOfEachChar(s);
    }
}
