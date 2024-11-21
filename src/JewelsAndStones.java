import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public static int countJewelsInStonesBruteForce(String j,String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int k = 0; k < j.length(); k++){
                if(s.charAt(i) == j.charAt(k)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int countJewelsInStonesUsingHashMap(String j, String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch  = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count = 0;
        for(int k = 0; k < j.length(); k++){
            count += map.getOrDefault(j.charAt(k),0);
        }
        return count;
    }

    public static int countJewelsInStonesOptimised(String j,String s){
        int[] countArray = new int[123];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            countArray[s.charAt(i)]++;
        }
        for(int k = 0; k < j.length(); k++){
            count += countArray[j.charAt(k)];
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int count = countJewelsInStonesBruteForce(jewels, stones);
        System.out.println(count);

        int countByHashmap = countJewelsInStonesUsingHashMap(jewels, stones);
        System.out.println(countByHashmap);

        int countOptimised = countJewelsInStonesOptimised(jewels,stones);
        System.out.println(countOptimised);

    }
}
