import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    public static List<Integer> findAllAnagrams(String s, String p){

        List<Integer> result = new ArrayList<>();
        int[] sArray = new int[26];
        int[] pArray = new int[26];
        for(int i = 0; i < p.length(); i++){
            pArray[p.charAt(i) - 'a']++;
            sArray[s.charAt(i) -'a']++;
        }
        for(int i = 0; i < s.length() - p.length(); i++){
            if(isAnagram(sArray,pArray)){
                result.add(i);
            }
            sArray[s.charAt(i) -'a']--;
            sArray[s.charAt(i+p.length()) - 'a']++;
        }
        if(isAnagram(sArray,pArray)){
            result.add(s.length() - p.length());
        }
        return result;
    }

    private static boolean isAnagram(int[] sArray, int[] pArray) {
        for(int i = 0; i < pArray.length; i++){
            if(pArray[i] != sArray[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> allAnagrams = findAllAnagrams(s, p);
        System.out.println(allAnagrams);
    }
}
