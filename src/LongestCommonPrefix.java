public class LongestCommonPrefix {
    public static String findCommonPrefix(String[] strings){
        if(strings == null || strings.length == 0)
            return "";
        String lcp = strings[0];
        for(int i = 1; i < strings.length; i++){
            String currentWord = strings[i];
            int j = 0;
            while(j < currentWord.length() && j < lcp.length()
                    && currentWord.charAt(j) ==  lcp.charAt(j)){
                j++;
            }
            if(j == 0)
                return "";
            lcp = currentWord.substring(0,j);
        }
        return lcp;
    }

    public static void main(String[] args) {
        String[] strings = {"cat","camel","cable"};
        String[] words = {"a","bg","hj"};
        String commonPrefix = findCommonPrefix(strings);
        System.out.println(commonPrefix);

        String prefix = findCommonPrefix(words);
        System.out.println(prefix);

    }
}
