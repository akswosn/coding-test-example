package com.forlks.codingtest.codingtestexamplebyprogramers.programers.intro;

public class 배열두배만들기 {
  public int[] solution(int[] numbers) {

    for (var i =0; i< numbers.length; i++){
      numbers[i] += numbers[i];
    }

    return numbers;
  }

  public static void main(String[] args){
    var e = new 배열두배만들기();
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(e.solution(numbers));


  }
}
