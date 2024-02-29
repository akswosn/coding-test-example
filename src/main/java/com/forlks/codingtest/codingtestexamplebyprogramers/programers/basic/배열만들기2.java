package com.forlks.codingtest.codingtestexamplebyprogramers.programers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 배열만들기2 {
  public int[] solution(int l, int r) throws InterruptedException {
    var startLen = (""+l).length();
    int endLen =  (""+r).length();
    var answer = new int[]{-1};


    var str = "";
    for(var i =0;i < endLen+1; i++){
        str += "0";
    }

    var ansIdx = 0;
    while( Integer.parseInt(str) <= r){

//      System.out.println("n = "+n);]
      str = pushData(str);
//      System.out.println("str= "+str);
      var n = Integer.parseInt(str);

      if(n < l){
        continue;
      }

      if(n > r){
        break;
      }

      if(answer.length == ansIdx && 0 != n){
        answer = Arrays.copyOf(answer, answer.length+1);
      }
      answer[ansIdx] = n;
//      System.out.println("answer= "+Arrays.toString(answer));

      ansIdx++;
//      result.add(n);

    }

    return answer;
  }


  public String pushData(String a){
    var i = a.length()-1;
    StringBuilder sb = new StringBuilder(a);
    while(i > -1){
      var c = sb.charAt(i);

      if(c == '0'){
        sb.setCharAt(i, '5');
        break;
      }
      else{
        sb.setCharAt(i, '0');
        i--;
      }
    }

    return  sb.toString();
  }


  public static void main(String[] args) throws InterruptedException {
    var e = new 배열만들기2();

    var l = 5;
    var r = 555;

//    var l = 15;
//    var r = 20;
    System.out.println(Arrays.toString(e.solution(l,r)));


//    System.out.println(e.getValues(2,8));
  }
}
