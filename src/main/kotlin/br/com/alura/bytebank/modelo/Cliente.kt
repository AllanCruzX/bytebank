package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
   private  val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}