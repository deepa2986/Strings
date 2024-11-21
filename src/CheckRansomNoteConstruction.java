import java.util.HashMap;
import java.util.Map;

public class CheckRansomNoteConstruction {


    public static boolean checkRansomNoteConstruction(String ransomNote , String magazine){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) <= 0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }

    public  static boolean checkRansomConstructOptimised(String ransom, String magazine){
        int[] arr = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            arr[magazine.charAt(i) - 97]++;
        }

        for(int i = 0; i < ransom.length(); i++)
            if(--arr[ransom.charAt(i) - 97] < 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aaa";
        String magazine = "aab";
        boolean b = checkRansomNoteConstruction(ransomNote, magazine);
        System.out.println(b);

        boolean b1 = checkRansomConstructOptimised(ransomNote, magazine);
        System.out.println(b1);

    }
}
