import java.util.*;

public class GroupAnagramsTogether {
    public static List<List<String>> groupAnagramsTogether(String[] stringList) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : stringList){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else {
                List<String> strings = new ArrayList<>();
                strings.add(s);
                map.put(key,strings);
            }
        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"eat","mat","tan","ate","ant","tae","nat"};
        List<List<String>> groupAnagramsTogether = groupAnagramsTogether(strings);
        groupAnagramsTogether.forEach(stringList -> System.out.println(stringList));
    }
}
