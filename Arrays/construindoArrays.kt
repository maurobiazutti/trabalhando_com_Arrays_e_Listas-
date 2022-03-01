fun main() {

///Criando Arrays de Inteiros. Buscando o Maior e Menos valor usando for loop e forEach{}

    val numeros = intArrayOf(25, 19, 33, 20, 55, 40)
    var maiorNumero = Int.MIN_VALUE
    for (numero in numeros) {
        if (numero > maiorNumero) {
            maiorNumero = numero
        }
    }
    println(maiorNumero)

    var menorNum = Int.MAX_VALUE
    numeros.forEach { num ->
        if (num < menorNum) {
            menorNum = num
        }
    }
    println("Menor Numero $menorNum")

///////////////////////////////////////////////////////////////

    val numerosPares = intArrayOf(0, 2, 4, 6, 8, 10, 12)
    var maiorNumeroPar = Int.MIN_VALUE
    for (i in numerosPares) {
        if (i > maiorNumeroPar) {
            maiorNumeroPar = i
        }
    }
    println(maiorNumeroPar)

    var menorNumPar = Int.MAX_VALUE
    numerosPares.forEach { i ->
        if (i < menorNumPar) {
            menorNumPar = i
        }
    }
    println("Menor Numero Par $menorNumPar")

///////////////////////////////////////////////////////////////

    val numerosAleatorios = intArrayOf(2, 55, 80, 79, 46, 35, 782, 452, 7854, 10257)
    var menorNumero = Int.MAX_VALUE
    for (i in numerosAleatorios) {
        if (i < menorNumero) {
            menorNumero = i
        }
    }
    println(menorNumero)

    var maiorNumAleatorio = Int.MIN_VALUE
    numerosAleatorios.forEach { i ->
        if (i > maiorNumAleatorio) {
            maiorNumAleatorio = i
        }
    }
    println("Maior numero Aleatorio $maiorNumAleatorio")
}

