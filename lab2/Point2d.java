public class Point2d {
    /* координата X */
    private double x;
    /* координата Y */
    private double y;
    /* Конструктор инициализации */
    public Point2d ( double x, double y) {
        this.x = x;
        this.y = y;
    }
    /* Конструктор по умолчанию. */
    public Point2d () {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
    /* Возвращение координаты X */
    public double getX () {
        return x;
    }
    /* Возвращение координаты Y */
    public double getY () {
        return y;
    }
    /* Установка значения координаты X. */
    public void setX ( double val) {
        x = val;
    }
    /* Установка значения координаты Y. */
    public void setY ( double val) {
        y = val;
    }
}
