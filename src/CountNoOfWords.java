public class CountNoOfWords {

    public static int countWords(String s){
        int countWords = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && i < s.length() - 1 && s.charAt(i+1) != ' '){
                countWords++;
            }
        }
        return countWords;
    }
    public static void main(String[] args) {
        String s = "welcome to the world of   cinema";
        System.out.println(s.split("\\s+").length);

        int countWords = countWords(s);
        System.out.println(countWords);
    }
}
