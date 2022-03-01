package Arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = bigDecimalArrayOf("5000.00", "1500.00", "2000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salarioComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salarioComAumento.contentToString())

    val gastoInicial = salarioComAumento.somatorio()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salarioComAumento.fold(gastoInicial) { acumulador, salar ->
        acumulador + (salar * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    //sorted -> Para ordenar em ordem crescente
    val salariosEmOrdemCrescente = salarioComAumento.sorted()
    println(salariosEmOrdemCrescente)

    //take(n) -> Para pegar os (n) primeiros
    val tresPrimeirosSalarios = salariosEmOrdemCrescente.take(3)
    println(tresPrimeirosSalarios)

    //takeLast(n) -> Para pegar os (n) ultimos
    val doisUltimosSalarios: Array<BigDecimal> = salariosEmOrdemCrescente.takeLast(2).toTypedArray()
    println(doisUltimosSalarios.contentToString())

    val media = doisUltimosSalarios.media()
    println(media)

    //Jeito simplificado de escrever typeLine
    val mediaTresPrimeiroSalario = salarioComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaTresPrimeiroSalario)
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatorio() / this.size.toBigDecimal()
    }
}


//reduce{acumulador, valor} -> Para reduzir o array em um único valor(somatório, fatorial e etc)
fun Array<BigDecimal>.somatorio(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

//Função para criar o Array de bigDecimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}