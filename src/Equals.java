public class Equals {
    public static void main(String[] args) {

        String str1, str2;
        //str1 = "To jest jakis tekst";
        //str2 = "To jest jakis tekst";

        str1 = new String("To jest jakis tekst");
        str2 = new String("To jest jakis tekst");

        if (str1 == str2){ //Ta pętla jest dla komentarza powyżej
            System.out.println("Równe!");
        }

        if (str1.equals(str2)){
            System.out.println("Równe!!");
        }

        A a = new A();
        B b = new B();

        if (a.equals(b)){ // == ten znak porónuje referencje
            System.out.println("Równe!!!");
        }
    }
}

class A {}
class B {}
