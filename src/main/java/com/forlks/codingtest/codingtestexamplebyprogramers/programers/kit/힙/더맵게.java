package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.힙;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 더맵게 {

  /*
  public int solution(int[] scoville, int K) {
        int answer = 0;
        int[] arr = scoville;

        var isFinins = false;
        Arrays.sort(arr);
        if(arr[0] > K){
          return answer;
        }

        while(!isFinins){
          answer++;
          var calc = arr[0] + (arr[1] * 2);

          arr = Arrays.copyOfRange(arr, 1, arr.length);
          arr[0] = calc;
          Arrays.sort(arr);
    //      System.out.println(Arrays.toString(arr));

          if(arr[0] >= K){
            isFinins = true;
          }
          if(1 == arr.length){
            answer = -1;
            isFinins = true;
          }
        }

        return answer;
    }
  * */
//  public int solution(int[] scoville, int K) {
//    int answer = 0;
//
//    var list = Arrays.stream(scoville).boxed()
//        .filter(n -> n < K).sorted()
//        .collect(Collectors.toList());
//
////      System.out.println(list);
//    if(list.size() == 0){
//      return  -1;
//    }
//
//    while(list.size() > 1){
//      answer++;
//      var scv= list.get(0) + (list.get(1) * 2);
//      list.remove(0);
//      list.remove(0);
//
//      if(scv < K){
//        list.add(scv);
//        list = list.stream().sorted().collect(Collectors.toList());
//      }
////      System.out.println(answer +" >>>" + list);
//      if(list.size() == 1){
//        answer = -1;
//      }
//    }
//
//    return answer;
//  }

  public int solution(int[] scoville, int K) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for(var i = 0; i < scoville.length; i++){
      minHeap.add(scoville[i]);
    }
    var cnt = 0;


    while (minHeap.size() >= 1){

      if(minHeap.size() == 1){
        var last = minHeap.poll();
        if(last >= K){
          break;
        }
        else {
          cnt = -1;
          break;
        }
      }
      var n1 =minHeap.poll();

      if(n1 >= K){
        break;
      }
      else {
        cnt++;
        var n2 =minHeap.poll();
        var calc = n1 +(n2*2);
        minHeap.add(calc);
      }

//      System.out.println("cnt = "+ cnt + ":::: "+minHeap);
    }

//    System.out.println(minHeap);
//    var n =minHeap.poll();
//    System.out.println(n+" ::: "+minHeap);

    return cnt;
  }


  public static void main(String[] args){
    var e = new 더맵게();

    int[] scoville = {1, 2, 3, 9, 10, 12};
    var k = 7;

    System.out.println(e.solution(scoville, k));


  }
}
