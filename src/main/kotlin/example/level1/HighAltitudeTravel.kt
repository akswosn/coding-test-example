package com.forlks.codingtest.codingtestforprogramers.level1

import java.util.*

class HighAltitudeTravel {
    fun solution(maps: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val w = maps[0].length
        val h = maps.size
        var map: Array<Array<Char>> =Array(h) { Array(w) { '0' } }
        for(i in 0 until h){
            map[i] = arrayOf()
            println(Arrays.toString(maps[i].toMutableList().toTypedArray()))
            map[i] = maps[i].toMutableList().toTypedArray()
        }




        return answer
    }


    companion object{
        @JvmStatic fun main(args: Array<String>) {


            val maps = arrayOf("X591X","X1X5X","X231X","1XXX1")

            val h = HighAltitudeTravel()
            val result = h.solution(maps)
            println(result)
        }
    }
}
