package com.forlks.codingtest.codingtestexamplebyprogramers.programers.intro;

import java.util.Arrays;

public class 분수의덧셈 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int gcd = getGCD(denom1, denom2);

    int lcm = denom1 * denom2 / gcd;

    numer1 = numer1 * (lcm/ denom1);
    numer2 = numer2 * (lcm/denom2);
    
    int resultNumer = numer1+numer2;
    int resulDenom = lcm;
    
    var c = getGCD(resultNumer, resulDenom);
    if(c > 1){
      resultNumer = resultNumer / c;
      resulDenom = resulDenom / c;
    }
    

    return new int[]{resultNumer, resulDenom};
  }

  public int getGCD(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }
    return getGCD(num2, num1 % num2);
  }

  public static void main(String[] args){
    var e = new 분수의덧셈();

    var numer1 = 1;
    var denom1 = 2;
    var numer2 = 3;
    var demon2 = 4;

    System.out.println(Arrays.toString(e.solution(numer1,denom1,numer2,demon2)));

//    System.out.println(e.getGCD(2,3));
  }
}
