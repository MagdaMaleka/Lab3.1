public class Lab322 {
    public static void main(String[] args) {

        Parameters i = new Parameters();
        i.height = 200;
        i.depth = 5;
        i.weight = 30;

        System.out.println(i.height);
        System.out.println(i.depth);
        System.out.println(i.weight);

    }
}
class Parameters {
    int height;
    int depth;
    int weight;
}

