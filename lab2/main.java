public class main {
    public static void main(String[] args) {
        Point3d myPoint = new Point3d(2.,4.,50.);
        Point3d otherPoint = new Point3d(3.,6.,48.);
        System.out.println(myPoint.distanceTo(otherPoint));
    }
}