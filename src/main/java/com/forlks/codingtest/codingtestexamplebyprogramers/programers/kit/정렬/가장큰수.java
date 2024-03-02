package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.정렬;

import java.util.ArrayList;


public class 가장큰수 {
  public String solution(int[] numbers) {
    String answer = "";

    var result = new ArrayList<Integer>();

//String.format("%-5s", n + "").replace(" ", "x")
    var idx = 0;
    while(result.size() < numbers.length){
      result.add(numbers[idx]);
      numbers[idx] = -1;

      for(var i =0; i < numbers.length; i++){
        if(numbers[i] != -1){
          var a = String.format("%-5s", result.get(result.size()-1) + "").replace(" ",
              (result.get(result.size()-1)+"").charAt(0)+"");
          var b = String.format("%-5s", numbers[i]+ "").replace(" ",
              (numbers[i]+"").charAt(0)+"");

          if(Integer.parseInt(a) < Integer.parseInt(b)){ //swap
            var t = numbers[i];

            numbers[i] = result.get(result.size()-1);
            result.set(result.size()-1,t);
          }
        }
      }

//      System.out.println("result >>>>> "+result);
//      System.out.println("numbers >>>>> "+Arrays.toString(numbers));
      idx++;
      answer += result.get(result.size()-1);

    }


    return answer;
  }


  public static void main(String[] args){
    var e = new 가장큰수();

    var numbers = new int[]{6, 10, 2};
//    var numbers = new int[]{3, 30, 34, 5, 9};

    System.out.println(e.solution(numbers));
  }
}
