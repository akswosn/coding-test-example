package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 기능개발 {
  public Integer[] solution(int[] progresses, int[] speeds) {
    var complateJobs = new ArrayList<Integer>();


    int[] days = new int[progresses.length];

    for(var i =0; i < progresses.length; i++){
      days[i] = ((100 - progresses[i]) / speeds[i]) + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1);
    }


//    System.out.println(Arrays.toString(days));
    var count = 1;
    for(var i = 1; i < days.length; i++){
      if(days[i] <= days[i-1]){
        System.out.println(i+" >>> countUp = "+count);
        days[i] = days[i-1];
        count ++;
      }
      else {
        System.out.println(i+" >>> count add = "+count);
        complateJobs.add(count);
        count = 1;
      }
    }
    if(count > 0){
      complateJobs.add(count);
    }
//    System.out.println(Arrays.toString(days));
//    System.out.println(complateJobs)

    return complateJobs.stream().toArray(Integer[]::new);
  }

  public static void main(String[] args){
    var e = new 기능개발();

//    int[] progresses = {93, 30, 55};
//    int[] speeds = {1, 30, 5};

    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};

    System.out.println(Arrays.toString(e.solution(progresses, speeds)));
  }
}
