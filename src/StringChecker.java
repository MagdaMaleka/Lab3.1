public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze splaca swoje dlugi.";

        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu: " + str.length());
        System.out.println("Znak na pozycji 6 to: " + str.charAt(6));
        System.out.println("Fragment od znaku 10. do 16.: >>" + str.substring(10,16) + "<<");
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indeks pierwszego podtekstu \"długi\": " + str.indexOf("dlugi"));
        System.out.println("Wielkie litery: " + str.toUpperCase());

    }
}
