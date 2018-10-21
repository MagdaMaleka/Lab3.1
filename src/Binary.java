public class Binary {
    public static void main(String[] args) {

        // & - iloczyn bitowy

        // 1 1 -> 1
        // 0 1 -> 0
        // 0 1 -> 0
        // 0 0 -> 0

        // | - suma bitowa
        // 1 1 -> 1
        // 0 1 -> 1
        // 0 1 -> 1
        // 0 0 -> 0

        // ^ - XOR (eXclusive OR)
        // 1 1 -> 0
        // 0 1 -> 1
        // 0 1 -> 1
        // 0 0 -> 0

        // ~ - negacja bitowa

        // << - przesunięcie w lewo
        // >> - przesunięcie w prawo

        System.out.println("Negacja 5: " + (~5));

        int a = 6;
        int b = 5;

        int c = calculate(a, b);

        //show(a, b, c);

    }

    static int show(int a, int b, int c) {

        System.out.println("Operacja: " + a + " ^ " + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("-----------------");
        System.out.printf("%10s\n", Integer.toBinaryString(c));


        return c; // dodajemy return c ponieważ jest static int, przy static void nie trzeba
    }

    static int calculate (int a, int b){
        return a ^ b;
    }
}
