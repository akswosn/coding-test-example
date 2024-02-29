package programers.ai;

import java.util.HashSet;

public class 합승택시요금 {
  public int solution(int n, int s, int a, int b, int[][] fares) {
    int answer = 0;
    HashSet<Integer> range = new HashSet<>();



    return answer;
  }

  public static void main(String[] args){
    var e = new 합승택시요금();

    var n = 6;
    var s = 4;
    var a = 6;
    var b = 2;
    int[][] fares = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}
    , {2, 3, 22}, {1, 6, 25}};


    System.out.println(e.solution(n,s,a,b, fares));

  }
}
