public class Casting {
    public static void main(String[] args) {
        double d = 4.45;
        short s = 8;
        int i;

        i = s; // dla d powinno być '(int) d'

        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;

        veep = (VicePresident) emp; //niekompatybilność typów więc trzeba zastosować jawne rzutowanie }

        Float f1 = 4.23F;
        Float f2 = 6.34F;

        System.out.println(Math.min(f1, f2));

    }
}

class Employee {}
class VicePresident extends Employee{}


