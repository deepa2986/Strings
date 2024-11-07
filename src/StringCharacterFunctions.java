public class StringCharacterFunctions {

    public static void charWithAscII(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c + " " + (int)c);
        }
    }

    public static void printChar(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //  if(Character.isUpperCase(c))
            //   if(Character.isLowerCase(c))
            //if(Character.isDigit(c))
            //if(Character.isLetter(c))
            if(Character.isLetterOrDigit(c))
                System.out.println(c);
        }
    }

    public static void printVowels(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char ch = Character.toLowerCase(c);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println(ch);
        }
    }
    public static void countVowels(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char ch = Character.toLowerCase(c);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println(count);
    }

    public static void countLowerUpperChar(String s){
        int lowerCount = 0;
        int upperCount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))
                lowerCount++;
            if(Character.isUpperCase(ch))
                upperCount++;
        }
        System.out.println(lowerCount);
        System.out.println(upperCount);
    }

    public static void stringContainsOnlyUpperChar(String s){
        String upperString = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
                upperString = upperString + ch;
        }
        System.out.println(upperString);
    }

    public static void digitsFirstThenCharString(String s){
        String digitString = "";
        String charString = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                digitString  = digitString + ch;
            else charString = charString + ch;
        }
        String digitCharStr = digitString +" " + charString;
        System.out.println(digitCharStr);
    }

    public static void upperCaseThenRemainingString(String s){
        String upperString = "";
        String remaingString = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
                upperString = upperString + ch;
            else remaingString = remaingString + ch;
        }
        String result = upperString + remaingString;
        System.out.println(result);
    }

    public static void removeWhiteSpace(String s){
        String removeSpace = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isWhitespace(ch))
                removeSpace = removeSpace + ch;
        }
        System.out.println(removeSpace);
    }

    public static void reverseCaseOfString(String s){
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            char ch =  s.charAt(i);
            if(Character.isUpperCase(ch))
                reverse = reverse + Character.toLowerCase(ch);
            else reverse = reverse + Character.toUpperCase(ch);
        }
        System.out.println(reverse);
    }

    public static void reverseString(String s){
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }

    public static void checkPalindrome(String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
        }
    }
    public static void main(String[] args) {
        String s = "SimpLe Girl";
        charWithAscII(s);

        String str = "Its 12@4D&e8 Simple";
        printChar(str);

        printVowels(s);
        countVowels(s);

        countLowerUpperChar(s);
        stringContainsOnlyUpperChar(s);

        String st = "r8oy9d8j9 1new4yrk";
        digitsFirstThenCharString(st);

        upperCaseThenRemainingString(s);

        removeWhiteSpace(s);

        reverseCaseOfString(str);

        reverseString(str);







    }
}
