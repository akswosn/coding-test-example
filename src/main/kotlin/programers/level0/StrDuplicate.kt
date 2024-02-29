package com.forlks.codingtest.codingtestforprogramers.level0

class StrDuplicate {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
//        println("start $s to ${overwrite_string.length+s}")
        if(overwrite_string.length < 1
                || overwrite_string.length > my_string.length
                || my_string.length > 1000){
            return ""
        }

        if(s < 0 || s > (my_string.length - overwrite_string.length)){
            return ""
        }

//        println(oldStr)
        answer = my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)

        return answer
    }

    companion object{
        @JvmStatic fun main(args: Array<String>) {
//            val my_string = "He11oWor1d"
//            val overwrite_string = "lloWorl"
//            val s = 2


            val my_string = "Program29b8UYP"
            val overwrite_string = "merS123"
            val s = 7

            val e = StrDuplicate()
            println(e.solution(my_string, overwrite_string, s))
        }
    }
}
