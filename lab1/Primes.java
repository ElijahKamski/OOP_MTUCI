public class Primes {
    /**
     *
     * пройтись по всем числам от 2 до 100 и проверить их на "простоту"
     */
    public static void main() {
        for (int i=2;i<=100;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    /**
     *
     * @param n -возможно простое число
     * @return вернуть является ли число простым
     */
    public static boolean isPrime(int n){
        for (int i=2; i*i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}