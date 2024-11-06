import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {
    public static void printDuplicatesUsingHashMap(String s){

        Map<Character,Integer> map =  new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    public static void printDuplicatesUsingSet(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                System.out.print(c + " ");
            }
            set.add(c);
        }
    }

    public static void main(String[] args) {
        String s = "programming";
        printDuplicatesUsingHashMap(s);
        System.out.println();
        printDuplicatesUsingSet(s);
    }
}
