package com.forlks.codingtest.codingtestexamplebyprogramers.programers.basic;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    String result = "";
    for(var i = 0; i < a.length(); i++){
      var s = a.charAt(i)+"";

      if(s.equals(s.toUpperCase()) ){
        result += s.toLowerCase();
      }
      else {
        result += s.toUpperCase();
      }
    }
    System.out.println(result);
  }
}
