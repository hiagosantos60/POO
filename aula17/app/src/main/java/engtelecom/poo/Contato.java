package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    ArrayList<Email> emails = new ArrayList<>();
    ArrayList<Telefone> telefones = new ArrayList<>();
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    
    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean validarEmail(String valor) {
        String regex = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return valor != null && valor.matches(regex);
    }

    public boolean validarTelefone(String valor) {
        String regex = "^[1-9]{2}(9[0-9]{8}|[2-5][0-9]{7})$";
        return valor != null && valor.matches(regex);
    }

    public boolean addEmail(String rotulo, String valor) {
        boolean valido = validarEmail(valor);

        if(valido){
            Email e = new Email(rotulo, valor);
            emails.add(e);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeEmail(String rotulo, String valor){
        return emails.removeIf(e -> e.getRotulo().equals(rotulo) && e.getValor().equals(valor));
    }

    public boolean updateEmail(int indiceEmail, String rotulo, String valor) {
        if (indiceEmail < 0 || indiceEmail >= emails.size()) return false;

        if (!validarEmail(valor)) return false;

        Email e = emails.get(indiceEmail);
        e.setRotulo(rotulo);
        e.setValor(valor);

        return true;
    }

    public boolean addTelefone (String rotulo, String valor) {
        if(validarTelefone(valor)) {
            Telefone t = new Telefone(rotulo, valor);
            telefones.add(t);
            return true;
        }
        return false;
    }    

    public boolean removeTelefone (String rotulo, String valor) {
        return telefones.removeIf(t -> t.getRotulo().equals(rotulo) && t.getValor().equals(valor));
    }

    public boolean updateTelefone(int indiceTelefone, String rotulo, String valor) {
        if (indiceTelefone < 0 || indiceTelefone >= telefones.size()) return false;

        if (!validarTelefone(valor)) return false;

        Telefone t = telefones.get(indiceTelefone);
        t.setRotulo(rotulo);
        t.setValor(valor);

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(nome).append(" ").append(sobrenome).append("\n");
        sb.append("Data de Nascimento: ").append(dataNasc).append("\n");

        sb.append("Emails:\n");
        for (Email e : emails) {
            sb.append(" - ").append(e.toString()).append("\n");
        }

        sb.append("Telefones:\n");
        for (Telefone t : telefones) {
            sb.append(" - ").append(t.toString()).append("\n");
        }

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }

}
