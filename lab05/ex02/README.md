# Sistema de avaliações de filmes

> Um filme tem um título, um ano de lançamento, um gênero, um diretor e um ou mais atores. Um ator tem um nome e uma data de nascimento. Um filme pode ter uma ou mais avaliações, e cada avaliação está associada a um único filme e a um único usuário. Um usuário tem um nome, um e-mail e uma senha. Um usuário pode avaliar um ou mais filmes. Uma avaliação tem uma nota (de 1 a 5) e um comentário.

## Diagrama UML

``` mermaid
classDiagram

    Filme "1" o-- "1" Diretor
    Filme "1" o-- "1..*" Ator
    Filme "1" *-- "0..*" Avaliacao
    Usuario "1" --o "1..*" Avaliacao


    class Filme {
        - idFilme: int
        - titulo: String
        - anoDeLancamento: LocalDate
        - genero: String
        - diretores: Diretor
        - atores: ArrayList~Ator~
        - avaliacoes: ArraList~Avaliacao~

        + Filme(titulo: String, anoDeLancamento: LocalDate, genero: String, diretor: Diretor)

        + addAvalicao(avaliacao: Avaliacao) boolean
    }

    class Diretor {
        - nome: String
        - dataDeNascimento: LocalDate
    }

    class Ator {
        - nome: String
        - dataNascimento: LocalDate
    }

    class Usuario {
        - nome: String
        - email: String
        - senha: String 
    }

    class Avaliacao {
        - idAvalicao: int
        - usuario: Usuario
        - nota: int
        - comentario: String
    }

    
```