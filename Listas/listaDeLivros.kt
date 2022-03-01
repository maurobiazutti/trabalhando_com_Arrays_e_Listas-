package Listas

fun main() {

    //Criando Lista de Livros
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimaraes",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1946,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memorias Póstumas de Bras Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    //Agrupar em uma Lista
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    //Para adicionar um novo item a lista de livros
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    println(livros)
    livros.imprimeComMarcadores()

    //Para remover itens da lista
    livros.remove(livro1)
    println(livros)
    livros.imprimeComMarcadores()


    //Para Ordenar com "sorted()" a Lista de Livros é preciso estender o tipo Comparable e implementar o método compareTo na class Livro
    val ordenadoPorAnoPublucacao: List<Livro> = livros.sorted()
    ordenadoPorAnoPublucacao.imprimeComMarcadores()

    //Para ordenar de forma mais simples a lista por titula, autor, editora e etc. Usar o sortedBy{it.criterioEscolhido}
    val ordenarPorTitulo = livros.sortedBy { it.titulo }
    ordenarPorTitulo.imprimeComMarcadores()

    val ordenarPorAutor = livros.sortedBy { it.autor }
    ordenarPorAutor.imprimeComMarcadores()

    //filter{it.atributoDesejado == "O Que Desejo Pesquisar"} -> Devolve uma lista com os itens achados
    listaDeLivros
        .filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //startsWith("M") -> Faz a busca pela String desejada
    listaDeLivros
        .filter { it.titulo.startsWith("M") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()
}

//Função responsável por formatar impressão
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" ### Lista de Livros ### \n$textoFormatado")
}