public class main {
    public static void main(String[] args) {
        System.out.println("#"+1);
        Object[][] a={{"Nice", 942208},
                {"Abu Dhabi", 1482816},
                {"Naples", 2186853},
                {"Vatican City", 572}};
        Object[][] c= millionsRounding(a);
        System.out.println("[");
        for (int i=0;i<c.length;i++){
            System.out.println("["+"\""+c[i][0]+"\", "+c[i][1]+"],");
        }
        System.out.println("]");
        System.out.println("#"+2);
        String out2=String.format("[%.2f, %.2f]", otherSides(12)[0], otherSides(12)[1]);
        System.out.println(out2);
        System.out.println("#"+3);
        System.out.println(rps("rock", "paper"));
        System.out.println("#"+4);
        int[] a4={5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(a4));
        System.out.println("#"+5);
        System.out.println(reverseCase("sPoNtAnEoUs"));
        System.out.println("#"+6);
        System.out.println(inatorInator("EvilClone"));
        System.out.println("#"+7);
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));
        System.out.println("#"+8);
        System.out.println(String.format("%.1f",totalDistance(55.5, 5.5, 5, false)));
        System.out.println("#"+9);
        int [] a9={1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(String.format("%.2f", mean(a9)));
        System.out.println("#"+10);
        System.out.println(parityAnalysis(3));

    }
    public static Object[][] millionsRounding(Object[][] a){
        Object[][] b=a;
        for (int i=0;i<a.length;i++){
            b[i][1]=(Math.round(((int)a[i][1])/1000000.)*1000000);
        }
        return b;
    }
    public static double[] otherSides(int a){
        double[] ans={2.d*a, 1.d*Math.sqrt(3)*a};
        return ans;
    }
    public static String rps(String p1, String p2){
        if (p1.equals("rock")&&p2.equals("scissors") || p1.equals("scissors") && p2.equals("paper") || p1.equals("paper") && p2.equals("rock")){
            return "Player 1 wins";
        }
        if (p1.equals(p2)){
            return "TIE";
        }
        return "Player 2 wins";
    }
    public static int warOfNumbers(int[] a){
        int sumc=0;
        int sumn=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                sumc+=a[i];
            }
            else{
                sumn+=a[i];
            }
        }
        return Math.abs(sumc-sumn);
    }
    public static String reverseCase(String s){
        String s1="";
        for (int i=0;i<s.length();i++){
            if ('a'<=s.charAt(i) && s.charAt(i)<='z'){
                s1+=s.substring(i,i+1).toUpperCase();
            }
            else{
                s1+=s.substring(i,i+1).toLowerCase();
            }
        }
        return s1;
    }
    public static String inatorInator(String s){
        int a=s.length();
        String glas="euioa";
        if(glas.indexOf(s.charAt(a-1))!=-1){
            return s+"-inator " + a*1000;
        }
        return s+"inator "+a*1000;
    }
    public static boolean doesBrickFit(int a,int b, int c, int d, int e){
        int minb=Math.min(Math.min(a,b),c);
        int meanb=a+b+c-minb-Math.max(Math.max(a,b),c);
        int minw=Math.min(d,e);
        int maxw=Math.max(d,e);
        return minb<=minw && meanb<=maxw;
    }
    public static double totalDistance(double fuel, double v, int n, boolean cond){
        double v1=v*(1+n*0.05);
        if (cond){
            v1*=1.1;
        }
        return fuel*100/v1;
    }
    public static double mean(int[] a){
        double sum=0.0;
        for (int i:a){
            sum+=i;
        }
        return sum/a.length;
    }
    public static boolean parityAnalysis(int a){
        int sum=0;
        int a1=a;
        while (a>0){
            sum+=a%10;
            a/=10;
        }
        return (sum%2)==(a1%2);
    }
}