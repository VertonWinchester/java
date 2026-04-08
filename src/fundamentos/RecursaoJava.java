package fundamentos;

public class RecursaoJava {
    public static int mutiplicar(int n1, int n2){
        if (n1 == 0 || n2 == 0) return 0;
        else if (n2 == 1) return n1;
        else return n1 + mutiplicar(n1, n2 -1);
    }
    public static void main(String[] args) {
        System.out.println(mutiplicar(5, 6));
    }
}
