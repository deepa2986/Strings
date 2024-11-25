public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        int count = 0;
        if(s.length() == 0)
            return count;
        int currentLength = s.length() - 1;
        while (currentLength >= 0){
            if(s.charAt(currentLength) != ' '){
                break;
            }
            currentLength--;
        }

        for(int i = currentLength; i >= 0; i--){
            if(s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello world ";
        int lengthOfLastWord = lengthOfLastWord(s);
        System.out.println(lengthOfLastWord);
    }
}
