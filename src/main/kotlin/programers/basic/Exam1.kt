package programers.basic


class Exam1 {

    fun suffleStr(str1: String, str2: String): String {
        var answer: String = ""
        val len = str1.length

        for (i in 0 until len) {
            answer += str1.elementAt(i) + str2.elementAt(i).toString()
        }

        return answer
    }

    fun strList(arr: Array<String>): String = arr.joinToString("")

    fun maxSum(a: Int, b: Int): Int = if ("$a$b".toInt() > "$b$a".toInt()) {
        "$a$b".toInt()
    } else {
        "$b$a".toInt()
    }

    fun sumOr(a: Int, b: Int): Int = if ("$a$b".toInt() > 2 * a * b) {
        "$a$b".toInt()
    } else {
        2 * a * b
    }

    fun multiple(number: Int, n: Int, m: Int): Int = if (number % n == 0 && number % m == 0) {
        1
    } else {
        0
    }

    fun sniffling(n: Int): Int {
        val a = IntArray(n) { it + 1 }
        println(a.contentToString())
        var answer = 0
        if (n % 2 == 0) {
            answer = a.filter { a -> a % 2 == 0 }.map { a -> Math.pow(a.toDouble(), (2).toDouble()) }.sum().toInt()
        } else {
            answer = a.filter { a -> a % 2 == 1 }.sum()
        }

        return answer
    }

    fun orStr(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0

        when(ineq){
            "<" -> {
                if(eq == "="){
                    if(n <= m){
                        answer = 1
                    }
                    else{
                        answer = 0
                    }
                }
                else {
                    if(n < m){
                        answer = 1
                    }
                    else{
                        answer = 0
                    }
                }
            }
            ">" -> {
                if(eq == "="){
                    if(n >= m){
                        answer = 1
                    }
                    else{
                        answer = 0
                    }
                }
                else {
                    if(n > m){
                        answer = 1
                    }
                    else{
                        answer = 0
                    }
                }
            }
        }

        return answer
    }

    fun flagReture(a: Int, b: Int, flag: Boolean): Int = if(flag){
        a+b
    }
    else{
        a-b
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Exam1()
//1. >>>>>>>>>>>>>>>>>>>>>>>
//            val str1 = "aaaaa"
//            val str2 = "bbbbb"
//
//            println(e.suffleStr(str1, str2))

//2.>>>>>>>>>>>>>>>>>>>>>>>>
//            val arr = arrayOf("a","b","c")
//            println(e.strList(arr))

//3.>>>>>>>>>>>>>>>>>>>>>>>>
//            val a = 9
//            val b = 91
//
//            println(e.maxSum(a, b))

//            val a = 2
//            val b = 91
//4. >>>>>>>>>>>>>>>>>>>>>>>
//            val a = 91
//            val b = 2
//            println(e.sumOr(a, b))
//            val number = 60
//            val n = 2
//            val m =3
//5. >>>>>>>>>>>>>>>>>>>>>>>>>>
//            val number = 55
//            val n = 10
//            val m =5
//
//            println(e.multiple(number,n,m))
//6. >>>>>>>>>>>>>>>>>>>>>>>>>>
//            val n = 7
//            val n = 10
//            println(e.sniffling(n))
//7. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//            val ineq = "<"
//            val eq = "="
//            val n = 20
//            val m = 50

//            val ineq = ">"
//            val eq = "!"
//            val n = 41
//            val m = 78
//
//            println(e.orStr(ineq, eq, n, m))
//8. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            val a = -4
            val b = 7
            val flag = true

            println(e.flagReture(a, b, flag))

        }
    }
}
