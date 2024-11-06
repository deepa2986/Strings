public class StringFunctions{

    public static void eachWord(String s){
        s = s +" ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word += ch;
            }else{
                System.out.println(word);
                word = "";
            }
        }
    }

    public static void printFirstCharOfEachWord(String s){
        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else{
                   System.out.println(word.charAt(0));
                word = "";
            }
        }
    }

    public static void sunStringOfEachWord(String s){

        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else{
                System.out.println(word.substring(0,2));
                word = "";
            }
        }
    }

    public static void wordStartsWith(String s){
        s = s + " ";
        String word = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(word.startsWith("h"))
                    System.out.println(word);
                word = "";
            }
        }
    }

    public static void wordContains(String s){
        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word += ch;
            }else{
                if(word.contains("k"))
                    System.out.println(word);
                word = "";
            }
        }
    }
    public static void wordLength(String s){
        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(word.length() == 3)
                    System.out.println(word);
                word = "";
            }
        }
    }

    public static void specialWords(String s){
        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else{
                char firstLetter = word.charAt(0);
                char lastLetter = word.charAt(word.length() - 1);
                if(Character.toUpperCase(firstLetter) == Character.toUpperCase(lastLetter))
                    System.out.println(word);
                word = "";
            }
        }
    }

    public static void longestWord(String s){
        s += " ";
        String word = "";
        String longestWord = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else{
                if(word.length() > longestWord.length())
                    longestWord = word;
                word = "";

            }
        }
        System.out.println(longestWord);
    }
    public static void searchWord(String s,String search){
        s += " ";
        String word = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
           char ch =  s.charAt(i);
            if(ch != ' '){
                word += ch;
            }else {
                if(word.equalsIgnoreCase(search))
                    count++;
                word = "";
            }
        }
        if(count == 0)
            System.out.println("search not found");
        else System.out.println("search found");
    }

    public static void countWords(String s){
        s += " ";
        String word = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else{                          
                count++;
                word = "";
            }
        }
        System.out.println(count);
    }

    public static void wordEndsWith(String s,String endsWith){
        s += " ";
        String word = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(word.endsWith(endsWith))
                   // System.out.println(word);
                    count++;
                word = "";
            }
        }
        System.out.println(count);
    }

    public static void changeWordWith(String s, String str, String changeWith){
        s += " ";
        String word = "";
        String newStr = "";
        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           if(c != ' '){
               word += c;
           }else{
               if(word.equalsIgnoreCase(str))
                   newStr = newStr + changeWith + " ";
               else newStr = newStr + word + " ";
               word = "";
           }
        }
        System.out.println(newStr);
    }

    public static void deleteWord(String s,String deleteWord){
        s += " ";
        String word = "";
        String newString = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(!word.equalsIgnoreCase(deleteWord))
                    newString = newString + word + " ";
                word = "";

            }
        }
        System.out.println(newString);
    }

    public static void changeCaseOfAlternateWord(String s){
        s += " ";
        String word = "";
        String newString = "";
        int count = 0;
        for(int i = 0; i < s.length();i ++){
            char c = s.charAt(i);
            if(c != ' '){
                word += c;
            }else {
                if(count++ % 2 == 0)
                    newString = newString + word.toUpperCase() + " ";
                else newString = newString + word.toLowerCase() + " ";
                word = "";
            }
        }
        System.out.println(newString);
    }

    public static void capitaliseEachWord(String s){
        s += " ";
        String word = "";
        String newString = "";
        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           if(c != ' '){
               word += c;
           }else{
              char firstChar = word.charAt(0);
              firstChar = Character.toUpperCase(firstChar);
              newString = newString + firstChar + word.substring(1)+" ";
              word = "";
           }
        }
        System.out.println(newString);
    }

    public static void swapFirstAndLastLetter(String s){
        s += " ";
        String word = "";
        String newString = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word += ch;
            }else {
               char firstChar = word.charAt(0);
               char lastChar = word.charAt(word.length() - 1);
               String mid = word.substring(1,word.length() - 1);
               newString = newString + lastChar + mid + firstChar + " ";
               word = "";
            }
        }
        System.out.println(newString);
    }
    public static void main(String[] args) {
        String s = "croissants makes kids happy day and happier";
        String s1 = "mom is going to meet dad";
        eachWord(s);
        printFirstCharOfEachWord(s);
        sunStringOfEachWord(s);
        wordStartsWith(s);
        wordContains(s);
        wordLength(s);
        specialWords(s1);
        longestWord(s);

        String search = "kids";
        searchWord(s,search);
        countWords(s);

        String endsWith = "y";
        wordEndsWith(s,endsWith);

        String str = "its a red seed";
        String word = "red";
        String changeWith = "blue";
        changeWordWith(str,word,changeWith);
        String deleteWord = "red";
        deleteWord(str,deleteWord);

        changeCaseOfAlternateWord(str);

        capitaliseEachWord(s);

        swapFirstAndLastLetter(str);




    }
}
