package com.forlks.codingtest.codingtestexamplebyprogramers.programers.basic;

public class 문자열겹쳐쓰기 {
  public String solution(String my_string, String overwrite_string, int s) {
    var answer = "";

//        println(oldStr)

    answer = my_string.substring(0, s)
        +overwrite_string
        + my_string.substring(overwrite_string.length()+s);
    return answer;
  }

  public static void main(String[] args){
    var e = new 문자열겹쳐쓰기();

    System.out.println(e.solution("He11oWor1d", "lloWorl", 2));
  }
}
