import java.util.Arrays;

public class CheckValidAnagrams {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }
    public static boolean isAnagramOptimised(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int[] countChar = new int[26];
        for(int i = 0; i < s1.length(); i++){
            countChar[s1.charAt(i) - 'a']++;
            countChar[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < countChar.length; i++){
            if(countChar[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "car";
        String s2 = "rae";
        boolean isAnagram = isAnagram(s1, s2);
        System.out.println(isAnagram);

        boolean anagramOptimised = isAnagramOptimised(s1, s2);
        System.out.println(anagramOptimised);
    }
}
