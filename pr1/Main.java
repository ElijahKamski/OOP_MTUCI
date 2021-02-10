import java.security.MessageDigest;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите номер задания(0 для выхода): ");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
        switch (n){
            case (1):
                System.out.println("Введите число: ");
                a = sc.nextInt();
                System.out.println(convert(a));
                break;
            case (2):
                System.out.println("Введите числa: ");
                a = sc.nextInt();
                b=sc.nextInt();
                System.out.println(points(a,b));
                break;
            case (3):
                System.out.println("Введите числa: ");
                a = sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                System.out.println(footballPoints(a,b,c));
                break;
            case(4):
                System.out.println("Введите числo: ");
                a = sc.nextInt();
                System.out.println(divisibleByFive(a));
                break;
            case(5):
                System.out.println("Введите числa(1|0): ");
                a = sc.nextInt();
                b=sc.nextInt();
                System.out.println(and(a>0,b>0));
                break;
            case(6):
                System.out.println("Введите числa: ");
                a = sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                System.out.println(howManyWalls(a,b,c));
                break;
            case(8):
                System.out.println("Введите числa: ");
                double a1 = sc.nextDouble();
                b=sc.nextInt();
                c=sc.nextInt();
                System.out.println(profitableGamble(a1,b,c));
                break;
            case(7):
                System.out.println("Введите числo: ");
                a = sc.nextInt();
                System.out.println(Challenge.squared(a));
                break;
            case(9):
                System.out.println("Введите числa: ");
                a = sc.nextInt();
                b=sc.nextInt();
                System.out.println(frames(a,b));
                break;
            case(10):
                System.out.println("Введите числa: ");
                a = sc.nextInt();
                b=sc.nextInt();
                System.out.println(mod(a,b));
                break;
            default:
                System.out.println("Try something else(1<=n<=10)");
        }
            System.out.println("Введите номер задания(0 для выхода): ");
        n=sc.nextInt();
        }
        System.out.println("Good Byte!");
    }
    public static int convert(int a){
        return a*60;
    }
    public static int points(int a, int b){
        return a*2+b*3;
    }
    public static int footballPoints(int a, int b, int c){return a*3+b;}
    public static boolean divisibleByFive(int a){return (a % 5)==0;}
    public static boolean and(boolean a, boolean b){return a&&b;}
    public static int howManyWalls(int n, int w, int h){return n/(w*h);}
    public static boolean profitableGamble(double a, int b, int c){return (a*b)>c;}
    public static int frames(int a, int b){return a*b*60;}
    public static int mod(int a, int b){return(a-b*(a/b));}

}


