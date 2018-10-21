public class FamilyMember {

    static String surname = "Nowak";
    String name ;
    int age;

    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";

        FamilyMember mum = new FamilyMember();
        mum.age = 25;
        mum.name = "Agata";

        FamilyMember.surname = "Kowalski";

        System.out.println("Tata: " + dad.name + " " + FamilyMember.surname + " " + dad.age + " lat.");
        System.out.println("Mama: " + mum.name + " " + FamilyMember.surname + " " + mum.age + " lat.");

        System.out.println(Math.max(234235,25434534));

        int i = 6567567;

        String str = String.valueOf(i);
        System.out.println(str.charAt(5));
    }
}
