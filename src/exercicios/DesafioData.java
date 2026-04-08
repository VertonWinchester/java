package exercicios;

public class DesafioData {
    int dia;
    int mes;
    int ano;
    DesafioData(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }
    DesafioData(int dias, int meses, int anos){
        dia = dias;
        mes = meses;
        ano = anos;
    }
    String obterDataFormatada(){
        return String.format("%d/%d/%d",dia, mes, ano);
    }
}