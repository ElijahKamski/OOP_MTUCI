public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(oppositeHouse(5,46));
        System.out.println(2);
        System.out.println(nameShuffle("Seymour Butts"));
        System.out.println(3);
        System.out.println(discount(89, 20));
        System.out.println(4);
        int [] a={10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(a));
        System.out.println(5);
        System.out.println(equal(3, 4, 3));
        System.out.println(6);
        System.out.println(reverse("Edabit is really helpful!"));
        System.out.println(7);
        System.out.println(programmers(147, 33, 526));
        System.out.println(8);
        System.out.println(getXO("ooxXm"));
        System.out.println(9);
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(10);
        System.out.println(sameAscii("AA", "B@"));
    }
    public static int oppositeHouse(int a, int b){
        int mch=2*b;
        int mn=2*b-1;
        if (a%2==1){
            return mch-(a-1);
        }
        else{
            return mn-(a-2);
        }
    }
    public static String nameShuffle(String name){
        String[] dbname=name.split(" ");
        return dbname[1]+" "+dbname[0];
    }
    public static float discount(int a, int b){
        return a*(100-b)/100.f;
    }
    public static int differenceMaxMin(int[] a){
        int min=(int)1e9;
        int max=(int) -1e9;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }
        return (int) max-min;
    }
    public static int equal(int a, int b, int c){
        int sum=0;
        if (a==b){
            sum=2;
        }
        if (b==c){
            if (sum==2) {sum++;}
            else {sum=2;}
        }
        if (a==c){
            if (sum<2) {sum=2;}
            else if (sum==2) {sum++;}
        }
        return sum;
    }
    public static String reverse(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        return res;
    }
    public static int programmers(int a,int b,int c){
        int[] d={a,b,c};
        return differenceMaxMin(d);
    }
    public static boolean getXO(String s){
        s=s.toLowerCase();
        int x=0;
        int o=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'x') {
                x++;
            }
            if (s.charAt(i) == 'o') {
                o++;
            }
        }
        return x==o;
    }
    public static String bomb(String s){
        s=s.toLowerCase();
        String s1="";
        for (int i=0;i<s.length();i++){
            if ('a'<=s.charAt(i) && s.charAt(i)<='z' || s.charAt(i)==' '){
                s1+=s.charAt(i);
            }
        }
        String [] b=s1.split(" ");
        for (int i=0;i<b.length;i++){
            if (b[i].equals("bomb")){
                return "DUCK!";
            }
        }
        return "Relax, there's no bomb.";
    }
    public static boolean sameAscii(String a, String b){
        int suma=0;
        int sumb=0;
        for (int i=0;i<a.length();i++){
            suma+=a.charAt(i);
        }
        for (int i=0;i<b.length();i++){
            sumb+=b.charAt(i);
        }
        return suma==sumb;
    }
}