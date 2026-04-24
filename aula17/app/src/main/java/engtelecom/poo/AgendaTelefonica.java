package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class AgendaTelefonica {
    ArrayList<Contato> contatos = new ArrayList<>();

    public Contato findContato(String nome, String sobrenome, LocalDate dataNasc) {
        for (Contato c : contatos) {
            if(c.getNome().equals(nome) && c.getSobrenome().equals(sobrenome) && c.getDataNasc().equals(dataNasc)) {
                return c;
            }
        }
        return null;
    }

    private boolean isValido(int indice) {
        if(indice >=0 && indice < contatos.size()) return true;
        else return false;
    }

    public boolean addContato(Contato c) {
        if(c == null) return false;
        
        if (findContato(c.getNome(), c.getSobrenome(), c.getDataNasc()) != null) {
            return false;
        }
        contatos.add(c);
        return true;
    }
    
    public boolean removeContato(Contato c) {
        if(c == null) return false;
        return contatos.remove(c);
    }

    public boolean addEmail(String rotulo, String valor, int indiceContato) {
        if(!isValido(indiceContato)) return false;
        
        Contato c = contatos.get(indiceContato);
        return c.addEmail(rotulo, valor);
    }

    public boolean removeEmail(String rotulo, String valor, int indiceContato) {
        if(!isValido(indiceContato)) return false;
        Contato c = contatos.get(indiceContato);
        return c.removeEmail(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor, int indiceContato, int indiceEmail) {
        if (!isValido(indiceContato)) return false;
        Contato c = contatos.get(indiceContato);
        return c.updateEmail(indiceEmail, rotulo, valor);
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContato) {
        if (!isValido(indiceContato)) return false;
        Contato c = contatos.get(indiceContato);
        return c.addTelefone(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo, String valor, int indiceContato) {
        if (!isValido(indiceContato)) return false;
        Contato c = contatos.get(indiceContato);
        return c.removeTelefone(rotulo, valor);
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContato, int indiceTelefone) {
        if (!isValido(indiceContato)) return false;

        Contato c = contatos.get(indiceContato);
        return c.updateTelefone(indiceTelefone, rotulo, valor);
    }

    public void listaContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("=================================");
            System.out.println("Contato #" + i);
            System.out.println(contatos.get(i));
        }
    }
}
