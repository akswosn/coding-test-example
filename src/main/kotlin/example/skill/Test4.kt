package com.forlks.codingtest.codingtestforprogramers.skill

class Test4 {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        var areaPark = Array(park.size){ charArrayOf() }

        for (i in 0 until park.size){
            areaPark[i] = park[i].toCharArray()
            if(areaPark[i].indexOf('S') > -1){
                answer= intArrayOf(areaPark[i].indexOf('S'), i)
            }
            println(areaPark[i].contentToString())
        }

        println(answer.contentToString())
        for(route in routes){
            val action = route.split(" ")
            var move = action[1].toInt()
            var isMove = true
            when(action[0]){
                "E" -> {
                    var i = 0
                    while (i <= move){
                        val c = areaPark[answer[0]][answer[1] + i]

                        if(c == 'X'){
                            isMove = false
                            break;
                        }
                        i++
                    }

                    if(isMove){
                        answer[1] += move
                    }

                }
                "W" -> {
                    var i = 0
                    while (i <= move){
                        val c = areaPark[answer[0]][answer[1] - i]

                        if(c == 'X'){
                            isMove = false
                            break;
                        }
                        i++
                    }

                    if(isMove){
                        answer[1] -= move
                    }

                }
                "S" -> {
                    var i = 0
                    while (i <= move){
                        val c = areaPark[answer[0]+i][answer[1]]

                        if(c == 'X'){
                            isMove = false
                            break;
                        }
                        i++
                    }

                    if(isMove){
                        answer[0] += move
                    }
                }
                "N" -> {
                    var i = 0
                    while (i <= move){
                        val c = areaPark[answer[0]-i][answer[1]]

                        if(c == 'X'){
                            isMove = false
                            break;
                        }
                        i++
                    }
                    if(isMove){
                        answer[0] -= move
                    }
                }
                else -> {}
            }

            println(answer.contentToString())
        }

        return answer
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test4()

            val park = arrayOf("OSO","OOO","OXO","OOO")
            val routes = arrayOf("E 2","S 3","W 1")

            println(e.solution(park, routes).contentToString())

        }
    }
}
