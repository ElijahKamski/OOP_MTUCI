public class Palindrome {
    /** Считываем строки из аргументов и передаем их в функцию, после чего выводим её результат
     *
     * @param args - строки на вход
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    /**
     *
     * @param a - строка, которую надо развернуть
     * @return развернутая строка
     */
    public static String reverseString(String a){
        String s=a;
        String sn="";
        for (int i=s.length()-1;i>=0;i--){
            sn+=s.charAt(i);
        }
        return sn;
    }

    /**
     *
     * @param s - Возможный палиндром
     * @return - является ли строка палиндромом
     */
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }

}