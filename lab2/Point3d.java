public class Point3d extends Point2d {
    //координата Z
    private double zCoord;
    //Конструктор инициализации
    public Point3d(double z){
        zCoord = z;
    }
    //конструктор по умолчанию
    public Point3d(){
        this(0);
    }
    //возвращение координаты Z
    public double getZ(){
        return zCoord;
    }
    //установка значения координаты Z
    public void setZ(double val) {
        zCoord = val;
    }
    //сравнение
    public boolean comparison(Point3d point){
        return this.getZ()==point.getZ()&&this.getY()==point.getY()&&this.getX()==point.getX();
    }
    // Подсчёт расстояния между двумя точками
    public double distanceTo(Point3d point){
        double distance = Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2) + Math.pow(this.getZ() - point.getZ(), 2));
        return (double) Math.round(distance * 100) / 100;
    }
}