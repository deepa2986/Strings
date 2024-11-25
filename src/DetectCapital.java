public class DetectCapital {

    public static boolean isCapital(String s){
        int capitalCount = 0;
        int smallCount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                capitalCount++;
            }else smallCount++;
        }
        return (capitalCount == s.length()) || (smallCount == s.length()) ||
                ((capitalCount == 1) && (s.charAt(0) >= 65) && (s.charAt(0) <= 90));
    }
    public static void main(String[] args) {

        String s = "Usa";
        boolean capital = isCapital(s);
        System.out.println(capital);

    }
}
