package com.forlks.codingtest.codingtestforprogramers.level0

class StrPrint {

    companion object{
        @JvmStatic fun main(args: Array<String>) {
            val a = readLine()?.toInt()!!
            val s = if(a % 2 == 0){
                "even"
            }
            else {
                "odd"
            }
            println("$a is $s")
        }
    }

}
