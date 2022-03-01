fun main() {
    // Array com Idades
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)

    //Maximo valor
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    //Menor valor
    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    //Media das Idades
    val media = idades.average()
    println("Media das idades: $media")

    //all -> Verifica todos os itens do array
    //Verificar se Todos são maiores de 18
    val todosMaiores = idades.all { it >= 18 }
    println("Todos são maiores? $todosMaiores")

    //any -> Para verificar se pelo menos um item satisfaz a condição
    //Vai verificar se pelo menos Uma idade é maior ou igual a 18
    val existeMaiorDeIdade = idades.any { it >= 18 }
    println("Algum aluno é maior de Idade? $existeMaiorDeIdade")

    //filter -> Trás a lista de quem satisfazer a condição
    val maioresDe18 = idades.filter { it >= 18 }
    println("Lista dos Maiores de 18: $maioresDe18")

    //find -> Faz uma busca e traz o Primeiro valor encontrado
    val buscarValor = idades.find { it == 18 }
    println("Busca 18: $buscarValor")

    //sum -> Para fazer somatório dos itens do array
    var somaDasIdades = idades.sum()
    println(somaDasIdades)


}