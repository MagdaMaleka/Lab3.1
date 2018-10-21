import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4,13);

        System.out.println("Polozenie poczatkowe:");
        System.out.println("x rowne: " + location.x);
        System.out.println("y rowne: " + location.y);

        System.out.println("Przejscie do (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("Polozenie koncowe:");
        System.out.println("x rowne: " + location.x);
        System.out.println("y rowne: " + location.y);

    }
}
