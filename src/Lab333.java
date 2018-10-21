public class Lab333 {
    public static void main(String[] args) {

        C c1 = new C();
        C c2= new C();

        for (int i=1; i<100000; i++){
            new C();
        }

        System.out.println("Stworzono " + C.counter + " obiektow");

    }
}

class C{
    static int counter;
      public C(){
          counter++;
            //System.out.println("Tworze nowy obiekt !!");
        }
}



