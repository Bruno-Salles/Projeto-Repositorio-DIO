package application

import java.util.Scanner

class Account(
    private var agencia: Int,
    private var conta: Int,
    private var nomeTitular: String,
    private var docTitular: String,
) {
    init {
        println()
        println("Conta Criada!")
        println("Agência: ${this.agencia}, Conta Corrente: ${this.conta}" +
                ", Titular: ${this.nomeTitular}, CPF: ${this.docTitular}")
    }

    fun getAgencia(): Int {
        return agencia
    }

    fun getConta(): Int {
        return conta
    }

    fun getNomeTitular(): String {
        return nomeTitular
    }

    fun getDocTitular(): String {
        return docTitular
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    print("Informe seu nome: ")
    val nome = sc.nextLine()
    print("Infome seu CPF: ")
    val doc = sc.next()

    val agencia = intArrayOf(1111, 2222, 3333, 4444)
    val conta = (100000..999999).random()

    var contaCorrente = Account(agencia.random(), conta, nome, doc)
    println(contaCorrente.getConta())
}

