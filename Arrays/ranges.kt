fun main() {

// Ranges //
    val serie: IntRange = 1.rangeTo(10)
    for (i in serie) {
        print("$i ")
    }
    println()

    println("Serie de Pares")
    // Criar uma serie de numeros pares de 0 a 20
    // step -> Vai contar de 2 em 2
    val numerosPares = 0..20 step 2
    for (pares in numerosPares) {
        print("$pares ")
    }
    println()

    // until -> Não vai pegar o ultimo numero
    // step -> Vai contar de 3 em 3
    val numQualquer = 2.until(26) step 3
    for (n in numQualquer) {
        print("$n ")
    }
    println()

    // downTo -> Para criar um serie decrescente
    val nunDecrescente = 35 downTo 0 step 4
    nunDecrescente.forEach { print("$it ") }
    println()

    //Para Verificar se um determinado numero esta dentro do intervalo do ranger
    val intervalo = 1000.0..3000.50
    val salario = 2550.50
    if (salario in intervalo) {
        println("Ésta dentro do intervalo")
    } else {
        println("Não esta dentro do intervalo")
    }

    //Para verificar se uma determinada letra esta dentro do ranger
    val conjuntoLetras = "a".."z"
    val letra = "w"
    println(letra in conjuntoLetras)
}