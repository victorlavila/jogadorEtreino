package br.com.digitalHouse

class jogadorDeFutebol (var nome : String,
                        var energia : Int,
                        var alegria : Int,
                        var gols : Int,
                        var experiencia : Int) {
    fun fazerGol(){
        gols += 1
        energia -= 5
        alegria += 10
        println("Goooooooooool!")
    }

    fun correr(){
        energia -= 10
        println("Cansei!")
    }
}