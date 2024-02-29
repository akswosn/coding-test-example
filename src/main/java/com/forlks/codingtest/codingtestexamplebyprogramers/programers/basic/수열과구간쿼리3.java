package programers.basic;

import java.util.Arrays;

public class 수열과구간쿼리3 {
  public int[] solution(int[] arr, int[][] queries) {

    for(var i = 0; i < queries.length; i++){
      var temp = arr[queries[i][0]];
      arr[queries[i][0]] = arr[queries[i][1]];
      arr[queries[i][1]] = temp;
    }

    return arr;
  }


  public static  void main(String[] args){
    var e = new 수열과구간쿼리3();

    var arr = new int[]{0, 1, 2, 3, 4};
    var queries = new int[][]{{0,3},{1,2},{1,4}};

    System.out.println(Arrays.toString(e.solution(arr, queries)));


  }

}
