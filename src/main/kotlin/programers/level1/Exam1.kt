package com.forlks.codingtest.codingtestforprogramers.level1

import java.util.*

class Exam1 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        if(k < 3 || k > 9 || m < 3 || m > 10 || score.size < 7 || score.size > 1000000){
            return 0
        }

        Arrays.sort(score)
//        System.out.println(Arrays.toString(score))

        if(score[score.lastIndex] < k){
            return 0
        }

        var answer: Int = 0
        val startIdx = score.size % m
        var current = startIdx;
        while (current < score.size){
            val start = current
            val end = current + m
//            System.out.println("$start :: $end")


            val arr = score.slice(start until end)
//            System.out.println((arr))
            val total = arr[0] * m

            answer += total

            current += m
        }

//        System.out.println(answer)

        return answer
    }


    companion object{
        @JvmStatic fun main(args: Array<String>) {
            val e = Exam1()
//            val k = 3
//            val m = 4
//            val score = intArrayOf(1, 2, 3, 1, 2, 3, 1)
            val k = 4
            val m = 3
            val score = intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)


            val result = e.solution(k,m,score)
            System.out.println(result)

        }
    }
}
