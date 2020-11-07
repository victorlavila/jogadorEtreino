package br.com.digitalHouse

fun main() {
    val jogador = jogadorDeFutebol("Neymar", 100, 30, 0, 30)
    val treino = SessaoDeTreinamento(jogador)

    var jogador1 = jogadorDeFutebol("Messi", 300, 50, 0, 90)
    val treino1 = SessaoDeTreinamento(jogador1)

    treino.treinarA(jogador)
    println()
    treino.treinarA(jogador1)

}