import java.util.Locale;

public class Formater {
    public static void main(String[] args) {

        int i = 898798;
        String s = "Jakis napis";
        double d = Math.PI;

        System.out.printf("%20s\n", s);
        System.out.printf("%20d\n", i);
        System.out.printf(new Locale("us"),"%.20f", d); // new Locale ("us") żeby była kropka zamiast przecinka
    }
}
