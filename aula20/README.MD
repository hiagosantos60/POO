# Herança
> Permite criar classes a partir de classes já existentes
- Use herança quando diferentes classes compartilham caracterísiticas e comportamentos comuns, mas também possuem particularidades.
- Tipos de dados protected podem ser acessados somente para classes no mesmo pacotes

## Corpo docente e discente 

```mermaid
classDiagram
    direction BT

    CargoGestao --|> Pessoa 
    Aluno --|> Pessoa
    Professor --|> Pessoa

    class Pessoa {
        id : int
        nome : String
    }

    class Aluno {
        matricula : int
    }
    
    class Professor {
        disciplinas : ArrayList~String~ 
    }

    class CargoGestao {
        nomeFuncao : String
    }

```

## Livraria e classificações

```mermaid
classDiagram
    direction BT

    Jornal --|> Revista
    Gibi --|> Revista
    Livro --|> Obra
    Revista --|> Obra

    class Obra {

    }

    class Livro {
        isbn : String
    }

    class Revista {
        issn : String 
    }

    class Jornal {

    }

    class Gibi {

    }

```

## Veículos
```mermaid
classDiagram
    Veiculo <|-- Aquatico
    Veiculo <|-- Terrestre
    Veiculo <|-- Aereo
    Aquatico <|-- Barco
    Terrestre <|-- Carro
    Terrestre <|-- Caminhao
    Aereo <|-- Aviao

    class Veiculo {
        - velocidadeAtual: int
        + acelerar(v: int) : boolean
    }

    class Aereo {
        - AltitudeMaxima: int
    }

    class Aquatico {
        - CapacidadeDoLastro: int
    }

```

## Animais 
```mermaid
classDiagram
    Animal <|-- Herbivoro
    Animal <|-- Carnivoro
    Animal <|-- Onivoro
    Onivoro <|-- Gato
    Herbivoro <|-- Arara
    Carnivoro <|-- Baleia
    Onivoro <|-- Galinha
    Carnivoro <|-- Tubarao 
    Onivoro <|-- Cachorro

```
