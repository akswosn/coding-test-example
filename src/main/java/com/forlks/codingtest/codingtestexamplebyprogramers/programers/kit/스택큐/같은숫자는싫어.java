package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.스택큐;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
  public Integer[] solution(int [] arr) {
    var stack = new Stack<Integer>();

    stack.push(arr[0]);
    for(var i = 1; i <arr.length; i++){
      if( arr[i-1] != arr[i] ) stack.push(arr[i]);
    }
    return stack.toArray(new Integer[stack.size()]);
  }

  public static void main(String[] args){
    var e = new 같은숫자는싫어();

    int[] arr = {1,1,3,3,0,1,1};

    System.out.println(Arrays.toString(e.solution(arr)));

  }
}
