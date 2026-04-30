# Sistema de gestão de frotas
> Uma empresa possui uma frota de veículos. Cada veículo tem um modelo, uma placa e um ano de fabricação. A empresa tem vários motoristas, e cada motorista pode dirigir um ou mais veículos. A empresa registra o uso de cada veículo, incluindo a data, o motorista e a distância percorrida.

``` mermaid

classDiagram
    direction LR

    Registro "1..*" o-- "1" Veiculo
    Registro "1..*" o-- "1" Motorista

    class Veiculo {
        - modelo: String
        - placa: String
        - anoDeFabricacao: String
        + Veiculo(modelo: String, placa: String, anoDeFabricacao: String)
    }

    class Motorista {
        - nome: String
        - dataNasc: Localdate
        - categoriaCnh: String
        + Motorista(nome: String, dataNasc: Localdate, categoriaCnh: String)
        + mudarCategoria(novaCategoria: String) boolean
    }

    class Registro{
        - veiculo: Veiculo
        - motorista: Motorista
        - data: LocalDate
        - distancia: double
        + Registro(veiculo: Veiculo, motorista: Motorista, data: LocalDate, distancia: double)
    }

```