package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaEnderecosIguais(){

    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700",
        numero = 2
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700",
        numero = 2

    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
}