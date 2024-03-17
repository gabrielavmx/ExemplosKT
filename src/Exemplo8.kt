data class Frutas(var nime: String, var preco: Double)

fun main(args: Array<String>)
{
    var frutas = arrayListOf(Frutas("Banana", 1.50),Frutas("Morango", 3.20))

    for (fruta in frutas){
        println("${fruta.nime} - R$ ${fruta.preco}")
    }
}