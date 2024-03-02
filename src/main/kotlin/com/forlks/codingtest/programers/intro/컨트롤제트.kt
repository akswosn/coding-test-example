package com.forlks.codingtest.programers.intro

class 컨트롤제트 {
    fun solution(s: String): Int {
        var answer: Int = 0

        val arr = s.split(" ");
        arr.forEachIndexed { i, c ->
            if ("Z" == c) {
                if (i != 0) {
                    answer -= arr[i - 1].toInt()
                }
            } else {
                answer += c.toInt()
            }
//            println("### [$c] answer = $answer")
        }

        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = 컨트롤제트()

//            val s = "1 2 Z 3"
//            val s = "10 20 30 40"
//            val s = "10 Z 20 Z 1"
//            val s = "10 Z 20 Z"
            val s = "-1 -2 -3 Z"

            println(e.solution(s))
        }
    }
}
