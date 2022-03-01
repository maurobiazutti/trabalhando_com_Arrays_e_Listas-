package Listas

fun main() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = listaDeLivros
    )

    val porAutor = prateleira.organizarPorAutor()
    val porAnoDePulicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoDePulicacao.imprimeComMarcadores()
}