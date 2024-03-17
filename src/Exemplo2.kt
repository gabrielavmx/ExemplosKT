fun main(args: Array<String>){
    println("Digite o primeiro numero: ")
    val X = readLine()!!.toInt()

    print("Digite o segundo numero: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X, Y)
    println("O resultado da soma é = $resultado")
}

fun multiplica(b: Int, a: Int): Int{
    return b * a
}