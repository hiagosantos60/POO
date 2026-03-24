package entelecom.ifsc;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //mes começa em 1
    int[] meses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    @Override
    public String toString() {
        return String.format("%d/%s/%d", dia, mes, ano);
    }

    // validação ano bissesto
    private boolean isBissexto(int ano) {
        if (ano%4 == 0){
            if (ano%100 == 0 && ano%400 != 0) {
                return false;
            } else{
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean setDia(int dia) {
        
    }

    public boolean setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
            return true;
        } else return false;
    }

    public boolean setAno(int ano) {
        if (isBissexto(ano) == true)  {
            meses[3] = 29;
        } 
        
        this.ano = ano;
        return true;
    }
    

}
