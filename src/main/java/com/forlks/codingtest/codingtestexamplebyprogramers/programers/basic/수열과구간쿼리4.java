package com.forlks.codingtest.codingtestexamplebyprogramers.programers.basic;

import java.util.Arrays;

public class 수열과구간쿼리4 {
  public int[] solution(int[] arr, int[][] queries) {
//    System.out.println(" >>>> "+Arrays.toString(arr));
    for(var i =0; i < queries.length; i++){

      for(var i2 = queries[i][0]; i2 <= queries[i][1]; i2++){

//        System.out.println("### i2="+i2+", queries[i][2]="+queries[i][2]);
        if(queries[i][2] == 1){
//          System.out.println("### add i2="+i2);
          arr[i2]++;
        } else if(i2 % queries[i][2] == 0){
//          System.out.println("### add i2="+i2);
          arr[i2]++;
        }
      }
//      System.out.println(" >>>> "+Arrays.toString(arr));
    }

    return arr;
  }

  public static void main(String[] args){
    var e = new 수열과구간쿼리4();

    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};

    System.out.println(Arrays.toString(e.solution(arr, queries)));
  }
}
