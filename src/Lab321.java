import java.util.StringTokenizer;

public class Lab321 {
    public static void main(String[] args) {

        StringTokenizer urodzenia;

        String quote1 = "18/10/1989";
        urodzenia = new StringTokenizer(quote1,"/");
        System.out.println(urodzenia.nextToken());
        System.out.println(urodzenia.nextToken());
        System.out.println(urodzenia.nextToken());


    }
}
