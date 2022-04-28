import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome="Joao", cpf = "", senha = 3 )
    val maria = Cliente(nome="Maria", cpf = "", senha = 4 )

    val contaJoao = ContaPoupanca(joao, 1002)
    contaJoao.titular = joao
    var contaMaria = ContaCorrente(maria, 1003)
    contaMaria.titular = maria
    contaJoao.titular = joao

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}