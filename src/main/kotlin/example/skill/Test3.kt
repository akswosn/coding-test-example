package com.forlks.codingtest.codingtestforprogramers.skill

class Test3 {
    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test3()

            val seoul = arrayOf("Jane", "Kim")
            println(e.solution(seoul))

        }
    }
}
