import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByCharFrequency {

    public static String sortByCharFrequency(String s){

        StringBuilder builder = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] charArray = new List[s.length()];
        for(char c : map.keySet()){
            int freq = map.get(c);
            if(charArray[freq] == null){
                charArray[freq] = new ArrayList<>();
            }
            charArray[freq].add(c);
        }
        for(int i = charArray.length - 1; i >= 0; i--){
            if(charArray[i] != null ){
                List<Character> charList = charArray[i];
                for(char ch : charList){
                    int freq = map.get(ch);
                    while (freq > 0){
                        builder.append(ch);
                        freq--;
                    }
                }
            }
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        String s = "teeetftffttttf";
        String frequency = sortByCharFrequency(s);
        System.out.println(frequency);
    }
}
