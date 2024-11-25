public class CheckSubSequence {


    public static boolean isSubsequence(String s, String t){
        int sLen = s.length();
        int tLen = t.length();

        if(sLen == 0)
            return true;

        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < sLen && tIndex < tLen){
            if(s.charAt(sIndex) == t.charAt(tIndex))
                sIndex++;
            tIndex++;
        }
        return sIndex == sLen;
    }


    public static boolean isSubsequenceByRecursion(String s,String t){
        return subsequenceHelper(s,t,0,0);
    }

    public static boolean subsequenceHelper(String s, String t, int sIndex, int tIndex){
        if(s.length() == sIndex)
            return true;

        if(t.length() == tIndex)
            return false;

        return s.charAt(sIndex) == t.charAt(tIndex) ?
                subsequenceHelper(s,t,sIndex + 1, tIndex +1)
                :subsequenceHelper(s,t,sIndex,tIndex + 1);
    }

    public static void main(String[] args) {

        String s = "abe";
        String t = "abcde";
        boolean subsequence = isSubsequence(s, t);
        System.out.println(subsequence);

        boolean b = isSubsequenceByRecursion(s, t);
        System.out.println(b);


    }
}
