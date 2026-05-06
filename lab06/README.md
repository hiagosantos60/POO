# Relógio digital

``` mermaid
classDiagram

    Relogio "1" *-- "6..*" Display
    Relogio "1" *-- "2..*" Delimitador
    Display "1" *-- "7" Segmento


    class Relogio {
        - hora: int
        - minutos: int
        - segundos: int
        - display: ArrayList~Display~ 
    }

    class Display {
        - numero: int
        - segmentos: ArrayList~Segmentos~
    }

    class Segmento {
        - ligado: boolean
    }

    class Delimitador {
        
    }

```