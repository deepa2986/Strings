public class IsSubsequenceOfAnother {

    public static boolean isSubsequence(String s1,String s2){
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            if(s1.length() == i){
                return true;
            }
            j++;
        }
        return false;
    }

    public static void main(String[] args) {

        String s1 = "ade";
        String s2 = "abcdefgh";
        boolean isSubsequence = isSubsequence(s1, s2);
        System.out.println(isSubsequence);


    }
}
