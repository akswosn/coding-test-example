package com.forlks.codingtest.codingtestforprogramers.skill

class Test6 {

    fun solution(s: String, skip: String, index: Int): String {
        var check = "abcdefghijklmnopqrstuvwxyz"
        var answer: String = ""


        for(del in skip.toCharArray()){
            check = check.replace(del.toString(), "")
        }
//        println("check = $check")

        for (char in s.toCharArray()){
            var cIndex = (check.indexOf(char) + index) % check.length
            val c = check[cIndex]

//            println("### char=$cIndex c=$c")
            answer += c
        }


        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test6()

            val s = "aukks"
            val skip = "wbqd"
            val index = 5
            println(e.solution(s, skip, index))
        }
    }
}
