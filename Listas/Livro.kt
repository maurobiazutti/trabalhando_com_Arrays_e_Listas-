package Listas

// data class -> Tipo especial de class que ja fornece algumas funções automaticamente: Exemplo equals(), hashCode(), toString
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}
