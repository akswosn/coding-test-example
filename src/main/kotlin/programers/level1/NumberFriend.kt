package com.forlks.codingtest.codingtestforprogramers.level1

class NumberFriend {

    fun solution(X: String, Y: String): String {
        val xArr = X.toMutableList()
        var YY = Y;
        val arr:MutableList<Int> = mutableListOf();

        if(X.length > 3000000|| Y.length > 3000000 || X.length < 3 || Y.length < 3){
            return "-1"
        }

        xArr.forEach { x ->
            if(YY.indexOf(x) > -1){
//                println("### before YY >>> $YY")
                YY = YY.replaceFirst(x.toString(), "");
                arr.add(x.digitToInt())
//                println("### YY >>> $YY")
            }
        }

        if(arr.isEmpty()){
            return "-1"
        }
        arr.sortDescending()
//        println(arr)
        var result = arr.joinToString("")
        if(result.startsWith("0")){
            result = "0"
        }
        return result
    }

    companion object{
        @JvmStatic fun main(args: Array<String>) {
//            val x = "100"
//            val y = "2345"

            val x = "100"
            val y = "203045"
//            val x = "100"
//            val y = "123450"
//            val x = "12321"
//            val y = "42531"
//            val x = "5525"
//            val y = "1255"


            val h = NumberFriend()
            val result = h.solution(x,y)
            println(result)
        }
    }
}
