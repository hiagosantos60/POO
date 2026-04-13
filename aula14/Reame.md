# Diagrama de classes UML

``` mermaid 
classDiagram 
    direction LR

    class Retangulo {
        - int altura
        - int largura
        + Retangulo(int a, int l)
        + getArea() int
    }
```

``` mermaid
classDiagram
    direction LR

    class Carro {
        - marca : String
        - propulsor : Motor
        + Carro()
        + acelerar(int v) void
    }

    class Motor {
        - hp : int
        - giroAtual : int
        - cilindros : int
        + Motor()
        + acelerar(v int) void
    }

    class Roda{
        - diametro : double
        - material : String
        - calibragem : double
        + Roda()
    }

    Carro"1" o-- "1"Motor  
    Carro"1" o-- "3..4"Roda


```