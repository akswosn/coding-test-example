package com.forlks.codingtest.codingtestforprogramers.skill

class Level2_2 {

    fun solution(topping: IntArray): Int {
        var answer: Int = 0

        val len = topping.size
        val a = len / 2
        val b = a+1
        var current = 0


        var set1 = HashSet<Int>()
        var set2 = HashSet<Int>()
        var max = len/2 + if(len % 2 == 0) {
            0
        }
        else {
            1
        }

        while(current <= max){
            println("current = $current")
            if(a + current < len){
                set1 = topping.slice(IntRange(0, a + current)).toHashSet()
                set2 = topping.slice(IntRange(b + current, topping.lastIndex)).toHashSet()

                println("1. a=${a + current}, b=${current+1}  ${topping.slice(IntRange(0, a + current))}  , ${topping.slice(IntRange
                (b + current, topping.lastIndex))}")
                if(set1.size == set2.size){
                    answer++
                }
            }

            if(current > 0){
                set1 = topping.slice(IntRange(0, a - current)).toHashSet()
                set2 = topping.slice(IntRange(b - current, topping.lastIndex)).toHashSet()
                println("2. a=${a - current}, b=${b - current}  ${topping.slice(IntRange(0, a - current))}  , " +
                        "${topping.slice(IntRange(b - current, topping.lastIndex))}")

                answer++
            }

            current++
        }


        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Level2_2()

            val topping = intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)
//            val topping = intArrayOf(1, 2, 3, 1, 4)

            println(e.solution(topping))
        }
    }
}
