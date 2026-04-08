package neps;

import java.util.Arrays;

public class TestePoo3 {

    public static void main(String[] args) {
        TestePoo teste1 = new TestePoo("Everton", "14/03/1989");
        TestePoo2 teste2 = new TestePoo2(teste1);

        for (TestePoo i: teste2.listas){
            System.out.println(i.data);
        }
    }

}
