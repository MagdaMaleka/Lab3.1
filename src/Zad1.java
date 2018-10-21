public class Zad1 {
    public static void main(String[] args) {
        int kwota = 1400;
        double wiecej = 0.4;
        int strata = 1500;
        double ponownyWzrost = 0.12;
        double wynik;

        wynik = kwota * wiecej;

        PierwszyRok(kwota, wiecej, wynik);
        DrugiRok(kwota, strata, wiecej, wynik);
        TrzeciRok(kwota, strata, wiecej, wynik, ponownyWzrost);
    }

    static double PierwszyRok(int kwota, double wiecej, double wynik){

        System.out.println("W pierwszym roku inwestycja wzrosła o: " + wynik + " zł");

        return (wynik);
    }

   static double DrugiRok(int kwota, int strata, double wiecej, double wynik){

        wynik = ((kwota * wiecej) + kwota) - strata;
        System.out.println("W drugim roku inwestycja wynosi: " + wynik + " zł");

        return (wynik);
    }

    static double TrzeciRok (int kwota, int strata, double wiecej, double wynik, double ponownyWzrost){
        wynik = (((kwota * wiecej) + kwota) - strata) * ponownyWzrost;
        System.out.println("W trzecim roku inwestycja zwiekszyła się o: " + wynik + " zł");

        return (wynik);
    }
}
