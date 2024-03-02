package com.forlks.codingtest.codingtestforprogramers.ai

class Example1 {
    fun solution(wallpaper: Array<String>): IntArray {
        var lux = -1
        var luy = -1
        var rdx = -1
        var rdy = -1

        for (i in 0 until wallpaper.size) {
            var page = wallpaper[i]

            while (page.indexOf("#") > -1){
                val y = page.indexOf("#")
                var x = i

                page = page.replaceFirst("#", ".")

//                println("X=$x, Y=$y")

                if (lux == -1) {
                    lux = x
                    luy = y
                    rdx = x + 1
                    rdy = y + 1
                } else {
                    if (lux > x) {
                        lux = x
                    }
                    if (luy > y) {
                        luy = y
                    }
                    if (rdx < x+1) {
                        rdx = x+1
                    }
                    if (rdy < y+1) {
                        rdy = y+1
                    }
                }
            }
        }

        return intArrayOf(lux, luy, rdx, rdy)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Example1()
//            val wallpaper = arrayOf(".#...", "..#..", "...#.")
//            val wallpaper = arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....")
            val wallpaper = arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#....")
            println(e.solution(wallpaper).contentToString())
        }
    }
}
