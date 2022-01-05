public class ReverseStrings {
    public static void main(String[] args) {
        String test = reverseString("Hello");
        System.out.println(test);
    }

    public static String reverseString(String input){
        if(input.equals("")){
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}
