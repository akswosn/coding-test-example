package programers.kit.정렬;

import java.util.Arrays;

public class k번째수 {
  public int[] solution(int[] array, int[][] commands) {

    var len = commands.length;
    int[] answer = new int[len];

    for(var i =0; i < len;i++){
      var arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
      Arrays.sort(arr);
//      System.out.println("arr ::: " + Arrays.toString(arr));
      answer[i] = arr[commands[i][2]-1];
//      System.out.println(Arrays.toString(answer));
    }
    return answer;
  }
}
