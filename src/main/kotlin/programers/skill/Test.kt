package com.forlks.codingtest.codingtestforprogramers.skill

import java.util.Arrays
import kotlin.math.sqrt

class Test {
    fun isPrime(n: Int): Boolean {
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    fun e1(nums: IntArray): Int {
        var answer = 0
        //2,3,5,7 % == 2
        val size = nums.size
        val n = nums.size -2
        val sum = ((n+1) * n) / 2
        println("sum (n=$n) ::: $sum")

        var current = 0
        val a = arrayOf(0,1,2)
        var value = intArrayOf()
        while (true){
            if(current != 0){
                a[2] ++
                if(a[2] >= size){
                    a[1] ++
                    a[2] = a[1] + 1
                }

                if(a[1] >= size){
                    a[0] ++
                    a[1] = a[0] + 1
                    a[2] = a[1] + 1
                }

                if(a[2] >= size ){
                    if(a[2] == (a[1] + 1) &&  a[2] == (a[0] + 2)){
                        break
                    }
                    continue
                }

            }
            println(a.contentToString())
            value = intArrayOf(nums[a[0]], nums[a[1]], nums[a[2]])
            val c = value.sum()
            println("value=${value.contentToString()} ")

            println("c=$c ::: ${isPrime(c)}")

            if(isPrime(c)){
                answer ++
            }
            current += 1
        }

        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val e = Test()

//            val nums = intArrayOf(1,2,3,4)
            val nums = intArrayOf(1,2,7,6,4)

            println(e.e1(nums))
        }
    }
}
