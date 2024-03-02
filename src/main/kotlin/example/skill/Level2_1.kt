package com.forlks.codingtest.codingtestforprogramers.skill

class Level2_1 {

    fun solution(p: String): String {
        var answer = ""

        var i =0

        var startWith = ""
        var startWithIdx = 1
        while(p.length > i){

            if('(' == p[i]){
                startWithIdx ++
            }
            else {
                startWithIdx --
            }
            startWith +=  p[i]

            if(startWithIdx == 1){
                var isFinish = false
                while (!isFinish){
                    startWith = startWith.substring(1) + startWith[0]
                    var checkInx = 0
                    var strCheck = true
                    for(cs in startWith.toCharArray()){
                        if('(' == cs){
                            checkInx ++
                        }
                        else {
                            checkInx --
                        }
                        if(checkInx < 0){
                            strCheck = false
                            break;
                        }
                    }
                    if (strCheck){
                        isFinish = true
                    }
                }

                answer += startWith
                startWith = ""
            }

//            if('(' == p[i]){
//                if(startWith < 0){
//                    answer += ")"
//                    startWith++
//                }
//                else{
//                    startWith += 1
//                    answer += p[i]
//                }
//
//            }
//            else {
//                startWith -= 1
//                if(startWith > -1){
//                    answer += p[i]
//                }
//                else {
//                    answer += "("
//                }
//            }

            println("[p[i]=${p[i]}] answer $answer")
            i++
        }

        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Level2_1()
//            val p = "(()())()"
//            val p = ")("
            val p = "()))((()"
//            val p = ")()("
            println(e.solution(p))
        }
    }
}
