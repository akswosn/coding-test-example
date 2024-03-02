package com.forlks.codingtest.codingtestexamplebyprogramers.programers.skill.level1;

public class 문제_0302 {

  public long solution(int price, int money, int count) {
    long answer = 0;

    for(var i =1; i <= count; i++){
      answer += (price * i);
    }


    if(answer <= money){
      return 0;
    }
    else {
      return answer - money;
    }
  }


  public static void main(String[] args){
    var e = new 문제_0302();

    var price = 3;
    var money = 20;
    var count = 4;

    System.out.println(e.solution(price, money, count));
  }
}
