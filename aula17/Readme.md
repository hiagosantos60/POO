
# Anotações
<details>
<summary> Anotações aula </summary>
    
</details>

## Exercício agenda telefônica
``` mermaid
classDiagram

    class App {

    }

    class AgendaTelefonica{
        - contatos: ArrayList~Contato~
        
        + addContato()
        + addEmail(String rotulo, String valor)
        + addTelefone(String rotulo, String valor)
        + removeTelefone(String rotulo, String valor, int indice)
        + removeEmail(String rotulo, String valor, int indice)
        + updateEmail(String rotulo, String valor, int indice)
        + updateTelefone(String rotulo, String valor, int indice)
        + findContato(String nome, String sobrenome, LocalDate dataNasc)
    }
    
    class Contato {
        - emails: ArrayList ~Email~
        - telefone: ArrayList ~Telefone~
        - nome: String
        - sobrenome: String
        - dataNasc: LocalDate

        + Contato(String nome, String sobrenome, LocalDate dataNasc)
        + addEmail(String rotulo, String valor)
        + addTelefone(String rotulo, String valor)
        + removeEmail(String rotulo, String valor)
        + removeTelefone(String rotulo, String valor)
        + removeEmail(String rotulo, String valor)
        + updateEmail(String rotulo, String valor)
        + updateTelefone(String rotulo, String valor)
    }

    class Telefone {
        - valor: String
        - rotulo : String
        + Telefone ()
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