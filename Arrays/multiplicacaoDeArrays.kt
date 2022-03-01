fun main() {

///Multiplicação de Array///
    println("Multiplicação de Array")

//Usando incremento
    val valores = doubleArrayOf(1500.00, 1750.50, 1840.25, 2100.30, 3000.00)
    val aumento = 1.1 // 10% de aumento
    var indice = 0 //para começar no indice zero e poder ir incrementando
    for (valor in valores) {
        valores[indice] = valor * aumento
        indice++
    }
    println("Valores Multiplicados usando o Incremento ${valores.contentToString()}")

//Usando Recursos do Kotlin .indices
    for (i in valores.indices) {
        valores[i] = valores[i] * aumento
    }
    println("Valores Multiplicados Usando Recursos do Kotlin .indices ${valores.contentToString()}")

//Mesma Operação usando forEachIndexed
    valores.forEachIndexed { i, valor ->
        valores[i] = valor * aumento
    }
    println("Valores Multiplicados Usando forEachIndexed ${valores.contentToString()}")
}