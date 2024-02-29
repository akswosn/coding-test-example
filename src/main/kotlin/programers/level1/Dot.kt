package com.forlks.codingtest.codingtestforprogramers.level1

class Dot {


    fun solution(k: Int, d: Int): Long {
        var currentX = 0
        var answer: Long = 0

        while (currentX <= d) {
            var currentY = 0
            while (currentY <= d) {
                if (currentX == d && currentY > 0) {
                    println("1.Nooooooo [currentX, currentY] ::: [$currentX, $currentY]")
                    currentY += k
                    break;
                } else if(currentX == d-1 && currentY >= d-1) {
                    println("2.Nooooooo [currentX, currentY] ::: [$currentX, $currentY]")
                    currentY += k
                    break;
                } else if(currentX > 0 && currentY == d){
                    println("3.Nooooooo [currentX, currentY] ::: [$currentX, $currentY]")
                    currentY += k
                    break;
                } else {
                    println("[currentX, currentY] ::: [$currentX, $currentY]")
                    currentY += k
                    answer++
                }
            }
            currentX += k
        }

        return answer
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            val k = 2
//            val d = 4
            val k = 1
            val d = 5

            val h = Dot()
            val result = h.solution(k, d)
            println(result)
        }
    }

}
