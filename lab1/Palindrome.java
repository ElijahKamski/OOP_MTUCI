public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
    public static String reverseString(String a){
        String s=a;
        String sn="";
        for (int i=s.length()-1;i>=0;i--){
            sn+=s.charAt(i);
        }
        return sn;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }

}