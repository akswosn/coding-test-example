package com.forlks.codingtest.codingtestforprogramers.level0

class Example {
    //1. 배수 구하기
    fun nMultiple(num: Int, n: Int): Int = if(num % n == 0){
        1
    }
    else {
        0
    }

    //2. 정수 구하기
    fun funInteger(flo: Double): Int = flo.toInt()

    //3. 문자열 곱하기
    fun strMultiple(my_string: String, k: Int): String {
        var answer: String = ""
        for(i in 0 until  k){
            answer += my_string
        }
        return answer
    }

    companion object{
        @JvmStatic fun main(args: Array<String>) {
            val e = Example()


            //1. nMultiple
//            val num = 98
//            val n = 2
//            val num = 34
//            val n = 3
//            println(e.nMultiple(num, n))
            //1. end

            //2.funInteger
//            val flo:Double = 1.42
//            val flo:Double = 69.32

//            println(e.funInteger(flo))
            //2,end

            //3. strMultiple
            val my_string = "string"
            val k = 3

            println(e.strMultiple(my_string, k))

        }
    }
}
