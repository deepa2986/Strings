import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FindNonRepeatingCharInAStream {

    public static String findNonRepeatingCharInAStream(String s){
        Map<Character,Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            queue.add(ch);
            while (!queue.isEmpty()) {
                if (map.containsKey(queue.peek()) && map.get(queue.peek()) > 1) {
                    queue.poll();
                } else break;
            }
            if (queue.isEmpty())
                result.append('#');
            else result.append(queue.peek());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abadbc";
        String result = findNonRepeatingCharInAStream(s);
        System.out.println(result);
    }
}
