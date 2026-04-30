# Sistema de reserva de passagens aéreas
> Uma companhia aérea oferece voos para diversos destinos. Cada voo tem um número de voo, um destino, uma data e uma hora de partida, e uma capacidade máxima de passageiros. Os passageiros podem reservar assentos em um voo, e cada reserva está associada a um único passageiro e a um único voo. Um passageiro tem um nome, um e-mail e um número de telefones

``` mermaid
classDiagram

    class Voo {
        - nDeVoo: int
        - destino: String
        - data: LocalDate
        - horaDePartida: LocalDate
        - capMaxima: int
    }

    class Passageiro {
        - nome: String
        - email: String
        - numeroDeTelefone: String
    }

    class Reserva {
        - String codigoReserva
        - int numeroAssento
        - LocalDateTime dataCriacao
    }

    Reserva "0..*" --o "1" Voo 
    Reserva "0..*" --o "1" Passageiro

``` 