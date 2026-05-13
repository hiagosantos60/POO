# Java of Empires
## Modelagem UML
- Todos os personagens devem ser capazes de se mover e atacar
- Cada personagem realiza essas ações de maneira diferente
- Para este exercício, basta que cada método retorne uma mensagem indicando o que o personagem está fazendo
## Implementação em Java
- Crie um aplicativo Java (classe com método main) e instancie objetos de cada classe de
personagem
- Chame os métodos mover e atacar para cada objeto e imprima as mensagens retornadas

## Diagrama UML

``` mermaid
classDiagram
    direction BT

    Aldeao --|> Personagem
    Arqueiro --|> Personagem
    Cavaleiro --|> Personagem

    class Personagem {
        - vida: int
        - ataque: int
        - velocidade: float
        - identificacao: String
        + andar() String
        + atacar() String
    }

```