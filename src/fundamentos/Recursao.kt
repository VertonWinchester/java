package fundamentos

fun Any.print() = println(this)

fun mutiplicar(n1: Int, n2: Int): Int{
    return if (n2 == 0 || n1 == 0) 0
    else if ( n2 == 1) n1
    else n1 + mutiplicar(n1, n2 - 1)
}

fun main() {
    mutiplicar(6,6).print()
}