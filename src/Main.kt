fun main(args: Array<String>){

//FOR
    val nombres = listOf("Alejandro","Pedro","Euclides","Abraham")

    for (nombre in nombres) println(nombre)

    for (position in nombres.indices) println("${nombres[position]} esta en la posicion $position")

    for (x in 1..5) println(x)

    for (y in 10..20 step 5) println(y)

    for (z in 40 downTo 35) println(z)

    for (z in 40 downTo 35 step 2) println(z)

//OPERATORS
    println(100+2)
    println(100.plus(2))
    println(100-2)
    println(100.minus(2))
    println(100*2)
    println(100.times(2))
    println(100/3)
    println(100.div(3))
    println(100%3)
    println(100.rem(3))

    var a = 10
    var b = 5
    a=a+b
    a+=b
    //a.plusAssign(b)

//WHILE
    var varWihile = 10
    while (varWihile<15){
        println("While $varWihile")
        varWihile++
    }

//DO WHILE
    var num=5
    do {
        println("Do while $num")
        num++
    } while (num<11)
}