package com.forlks.codingtest.codingtestforprogramers.skill

import java.util.function.Supplier

class Test2 {
    fun solution(num: Int): Int {
        var answer = 0
        var result = num
        println("Cnt= $answer ::: $result")

        while (result != 1 && answer <= 500) {
            result =  if(result % 2 == 0){
                result / 2
            }
            else {
                (result * 3) + 1
            }
            answer ++
            println("Cnt= $answer ::: $result")
        }

        if(result != 1){
            answer = -1
        }

        return answer
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test2()

//            val nums = intArrayOf(1,2,3,4)
            val num = 626331

            println(e.solution(num))
        }
    }
}

