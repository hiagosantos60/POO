# Agenda Telefonica

``` mermaid
classDiagram
    direction LR

    class App {
        - agenda : Agenda
        + main()
        + menu()
    }

    class AgendaTelefonica{
        - contatos: ArrayList~Contato~
        
        + AgendaTelefonica()
        + findContato(String nome, String sobrenome, LocalDate dataNasc) Contato
        + addContato(Contato c) boolean
        + removeContato(Contato c) boolean

        + addEmail(String rotulo, String valor, int indiceContatoNaLista) boolean
        + removeEmail(String rotulo, String valor, int indiceContatoNaLista) boolean
        + updateEmail(String rotulo, String valor, int indiceContatoNaLista) boolean
        
        + addTelefone(String rotulo, String valor, int indiceContatoNaLista) boolean
        + removeTelefone(String rotulo, String valor, int indiceContatoNaLista) boolean
        + updateTelefone(String rotulo, String valor, int indicindiceContatoNaLista) boolean
    }
    
    class Contato {
        - emails: ArrayList ~Email~
        - telefone: ArrayList ~Telefone~
        - nome: String
        - sobrenome: String
        - dataNasc: LocalDate
        - id : int

        + Contato(String nome, String sobrenome, LocalDate dataNasc)
        
        + addEmail(String rotulo, String valor) boolean
        + removeEmail(String rotulo, String valor) boolean
        + updateEmail(String rotulo, String valor) boolean
        
        + addTelefone(String rotulo, String valor) boolean
        + removeTelefone(String rotulo, String valor) boolean
        + updateTelefone(String rotulo, String valor) boolean
        
        + validarEmail(String valor) boolean
        + validarTelefone(String valor) boolean

        + toString() String
    }

    class Telefone {
        - valor: String
        - rotulo : String
        + Telefone (String rotulo, String valor)
        + toString() String
    }

    class Email{
        - rotulo: String
        - valor: String
        + Email(String rotulo, String valor)
        + toString() String 
    } 

    App "1"*--"1" AgendaTelefonica
    AgendaTelefonica "1"*--"0..*" Contato
    Contato "1"*--"0..*" Telefone
    Contato "1"*-- "0..*"Email

```