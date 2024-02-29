package com.forlks.codingtest.codingtestforprogramers.ai

class Example3 {

    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2
        var i = 0
        while (answer == 2 && dic.size > i){
            val d = dic[i]
            var isOneUse = false
            println("### check [d=$d], [spell=${spell.contentToString()}]")
            for(ii in 0 until spell.size){
                val s = spell[ii]
                println("### [s=$s] [d=$d] last=${d.lastIndexOf(s)}, index=${d.indexOf(s)}")
                if(d.indexOf(s) != d.lastIndexOf(s) || d.indexOf(s) == -1){
                    break
                }

                if(ii == spell.size -1){
                    isOneUse = true
                }
            }
            println("### check [d=$d], [spell=${spell.contentToString()}] isOneUse=$isOneUse")


            if(isOneUse){
                answer = 1
            }

            i++
        }


        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Example3()

            val spell = arrayOf("p", "o", "s")
            val dic = arrayOf("sod", "eocd", "qixm", "adio", "soo")


            println(e.solution(spell, dic))
        }
    }
}
