package br.com.alura.bytebank.modelo

class Atendente(
    nome: String,
    cpf : String,
    salario : Double,
): Funcionario(nome = nome,cpf = cpf,salario = salario){

    override val bonificacao: Double  get() {
        return salario * 0.1
    }
}