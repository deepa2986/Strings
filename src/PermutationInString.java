public class PermutationInString{

    public static boolean checkPermutation(String p,String s){
        int[] pArray = new int[26];
        int[] sArray = new int[26];

        for(int i = 0; i < p.length(); i++){
            pArray[p.charAt(i) - 'a']++;
            sArray[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length() - p.length(); i++){
            if(isPermutation(pArray,sArray))
                return true;
            sArray[s.charAt(i) - 'a']--;
            sArray[s.charAt(i + p.length()) - 'a']++;
        }
        if(isPermutation(pArray,sArray))
            return true;
        return false;
    }
    public static boolean isPermutation(int[] pArray,int[] sArray ){
        for(int i = 0; i < pArray.length; i++){
            if(pArray[i] != sArray[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String p = "ab";
        String s = "eidbaccd";

        boolean checkPermutation = checkPermutation(p, s);
        System.out.println(checkPermutation);
    }
}
