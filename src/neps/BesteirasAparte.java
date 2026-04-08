package neps;

public class BesteirasAparte {

    public Integer soma(Integer a, Integer b){
        return a+ b;
    }

    public static void main(String[] args) {
        System.out.println("Hello Word");

        System.out.println (new BesteirasAparte().soma(5, 8));
        System.out.println (new BesteirasAparte().soma(9, 3));
        System.out.println (new BesteirasAparte().soma(7, 6));
    }
}
