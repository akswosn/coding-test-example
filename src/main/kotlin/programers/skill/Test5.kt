package com.forlks.codingtest.codingtestforprogramers.skill

class Test5 {
    fun solution(numbers: IntArray): IntArray {
        val set = HashSet<Int>()
        var a= 0
        var b= 1
//        val arr = numbers.sortedArray()
        while (a < numbers.size-1 && b< numbers.size){
            if(numbers[a]+numbers[b] > 0){
                set.add(numbers[a]+numbers[b])
            }

            println("[a=$a, b=$b] valA=${numbers[a]}, valB=${numbers[b]} ...... v=${numbers[a]+numbers[b]}")
            b++
            if(b == numbers.size){
                a++
                b = a+1
            }
        }
//        println(set)
        return set.sorted().toIntArray()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test5()
//            val numbers = intArrayOf(2,1,3,4,1)
            val numbers = intArrayOf(5,0,2,7)


            println(e.solution(numbers).contentToString())
        }
    }
}
