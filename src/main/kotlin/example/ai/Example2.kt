package com.forlks.codingtest.codingtestforprogramers.ai

class Example2 {

    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        println("### answer = $answer")
        for(num in left until  right+1){
            var count = 0

            for(i in 1..Math.sqrt(num.toDouble()).toInt()){
                if(i * i == num) count++
                else if(num % i == 0) count += 2
            }

            if(count % 2 == 0){
                answer += num
            }
            else {
                answer -= num
            }
            println("### [num=$num, count=$count] answer = $answer")

        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Example2()

            val left = 13
            val right = 17

//            val left = 24
//            val right = 27

            println(e.solution(left, right))
        }
    }
}
