public class StringMethod {


       /* public static void main(String[]args){

            String name = "Igire";
            String reversed = "";
            for (int i=name.length() -1; i>=0;i--) {
                reversed= reversed + name.charAt(i);
            }
            System.out.println(reversed);
        } */

    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();


        String reversed = new StringBuilder(str).reverse().toString();


        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        String word3 = "Never odd or even";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2));
        System.out.println(word3 + " is palindrome? " + isPalindrome(word3));
    }

}
