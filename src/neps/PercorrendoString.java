
public class PercorrendoString {

    public static void main(String[] args) {
         String texto = "Everton";
         for (char i : texto.toLowerCase().toCharArray()){
             if (!(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i== 'u' )
             ) System.out.println(i);
         }
    }
}
