package com.forlks.codingtest.programers.all.level1

class 가장많이받은선물 {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {

        val result = mutableMapOf <String, MutableMap<String, Int>>()

        for(element in friends){
            var name = element
            val fbygift = mutableMapOf <String, Int>()
            //초기화
            for(element2 in friends){
                if(element2 != name){
                    fbygift[element2] = 0
                }
            }
            //주고 받은 선물
            var giftPoint = 0
            for (j in gifts.indices){
                if(gifts[j].indexOf(name) > -1){
                    val g = gifts[j].split(" ")
//                    println("$name >>>> gift=${gifts[j]} , index=${g.indexOf(name)}")
                    if(g.indexOf(name) == 0){
                        if(fbygift[g[1]] == null){
                            fbygift[g[1]] = 1
                        } else {
                            fbygift[g[1]] = fbygift[g[1]]!! + 1
                        }
                        giftPoint++
                    }
                    else {
                        if(fbygift[g[0]] == null){
                            fbygift[g[0]] = -1
                        } else {
                            fbygift[g[0]] = fbygift[g[0]]!! - 1
                        }
                        giftPoint--
                    }

                }
            }
            fbygift["gift_point"]=giftPoint
//            println("$name >>>> result = $fbygift")
            result.set(name, fbygift)
        }


        var answer = -9999

        for(key in result.keys){
            var point = 0;
            var map1 = result[key]!!
            for(key2 in map1.keys){
                if(key2 == "gift_point") continue
                val value = map1[key2]
                if(value == 0){
//                    println(">>> $key2 = ${result[key2]?.get("gift_point")}")
//                    println(">>> $key = ${map1?.get("gift_point")}")

                    if(result[key2]?.get("gift_point")!! < map1["gift_point"]!!){
                        point ++
                    }

                } else if(value!! > 0){
                    point ++
                }
            }

            if(answer < point){
                answer = point
            }
        }


        return answer
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = 가장많이받은선물()

//            val friends = arrayOf("muzi", "ryan", "frodo", "neo")
//            val gifts = arrayOf("muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi")

//            val friends = arrayOf("joy", "brad", "alessandro", "conan", "david")
//            val gifts = arrayOf("alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david")

            val friends = arrayOf("a", "b", "c")
            val gifts = arrayOf("a b", "b a", "c a", "a c", "a c", "c a")

            println(e.solution(friends, gifts))
        }
    }
}
