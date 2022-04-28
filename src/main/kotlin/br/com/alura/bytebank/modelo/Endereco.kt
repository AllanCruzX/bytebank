package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var cep: String = "",
    var complemento: String = ""
)    {


    override fun toString(): String {
        return """
            Endereco(logadouro='$logradouro', 
            numero=$numero,
            bairro='$bairro', 
            cidade='$cidade', 
            cep='$cep', 
            complemento='$complemento')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (numero != other.numero) return false
        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numero
        result = 31 * result + cep.hashCode()
        return result
    }


}