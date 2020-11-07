package br.com.digitalHouse

class SessaoDeTreinamento (jogadorDeFutebol: jogadorDeFutebol) {

    fun treinarA(jogadorDeFutebol: jogadorDeFutebol){
        println(jogadorDeFutebol.experiencia)
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.experiencia ++
        println(jogadorDeFutebol.experiencia)
        println(jogadorDeFutebol.energia)
    }
}