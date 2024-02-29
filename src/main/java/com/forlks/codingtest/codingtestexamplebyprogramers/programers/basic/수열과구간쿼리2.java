package programers.basic;

import java.util.Arrays;

public class 수열과구간쿼리2 {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    var idx = 0;
    while (idx < queries.length){

      int max = -1;

//      System.out.println("### start = "+queries[idx][0]);
//      System.out.println("### end = "+queries[idx][1]);

      for(var i = queries[idx][0]; i <= queries[idx][1] ; i++){

//        System.out.println("### arr val="+arr[i]+", check val="+queries[idx][2]);
        if(arr[i] > queries[idx][2]){
//          System.out.println(idx + " #### " + arr[i]+",  max="+max);
          if(max > arr[i] || max == -1){
            max = arr[i];

//            System.out.println(idx+" ]]] #### >>>> "+max);
          }
        }
      }
      answer[idx] = max;
      idx ++;
    }

//    System.out.println(Arrays.toString(answer));
    return answer;
  }

  public static void main(String[] args){
    var e = new 수열과구간쿼리2();

    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};

    System.out.println(e.solution(arr, queries));
  }
}
