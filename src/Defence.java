//string given and we have to convert lowercase to uppercase and should use recursion

public class Defence{

    public static void main(String[] args){
        String str = "astana city";
        System.out.println(convertToUpperCase(str));
    }
    public static String convertToUpperCase(String str){
        if(str == null || str.length() == 0){
            return " ";
        }

        char firstChar = Character.toUpperCase(str.charAt(0));
        String remainingString = convertToUpperCase(str.substring(1));
        return firstChar + remainingString;
    }
}