# Relógios e cronômetros
Um relógio é um dispositivo que mede e exibe o tempo. Neste laboratório, você vai trabalhar com duas representações: relógio digital (hora em formato numérico) e relógio analógico (hora indicada por ponteiros). Para relógios digitais, você também vai implementar o comportamento de cronômetro, que pode ser:
- Progressivo: inicia em 00:00: 00 e avança a cada segundo
- Regressivo: inicia em um valor definido pelo usuário e reduz até 00:00:00

## Diagrama UML

``` mermaid
classDiagram

    Relogio <|-- RelogioAnalogico
    Relogio <|-- RelogioDigital
    Cronometro <|.. RelogioDigital
    RelogioDigital <|-- RelogioDigitalTexto
    RelogioDigital <|-- RelogioDigitalDisplay
    RelogioDigitalDisplay *-- Display

    class Cronometro {
        <<Interface>>
        + setModoProgressivo(h: int, m: int, s: int) boolean
        + setModoRegressivo(h: int, m: int, s: int) boolean
        + setModoRelogio() boolean
    }

    class Relogio {
        <<Abstract>>
        # horas: int
        # minutos: int
        # segundos: int
        # posX: int
        # posY: int
        + avancarTempo()* void
        + desenhar(canvas: Draw)* boolean
        + setHorarioAtual() boolean
        + setHorarioManual(h: int, m: int, s: int) boolean
    }

    class RelogioDigital {
        <<Abstract>>
        # modo: int
        # h_cont: int
        # m_cont: int
        # s_cont: int
        + static final int MODO_RELOGIO
        + static final int MODO_PROGRESSIVO
        + static final int MODO_REGRESSIVO
        + setModoProgressivo(h: int, m: int, s: int) boolean
        + setModoRegressivo(h: int, m: int, s: int) boolean
        + setModoRelogio() boolean
    }

    class RelogioAnalogico {
        + RelogioAnalogico(x: int, y: int)
        + avancarTempo() void
        + desenhar(canvas: Draw) boolean
    }

    class RelogioDigitalTexto {
        - tamanhoFonte: int
        + RelogioDigitalTexto(x: int, y: int, fonte: int)
        + desenhar(canvas: Draw) boolean
    }

    class RelogioDigitalDisplay {
        - tamanho: int
        - displays: Display[6]
        - static final int TAM_PEQUENO
        - static final int TAM_MEDIO
        - static final int TAM_GRANDE
        + RelogioDigitalDisplay(x: int, y: int, tamanho: int)
        + desenhar(canvas: Draw) boolean
    }

    class Display {
        - segmentos: boolean[7]
        # setDigito(num: int) void
        + desenhar(canvas: Draw, x: int, y: int, tamanho: int) void
    }


```