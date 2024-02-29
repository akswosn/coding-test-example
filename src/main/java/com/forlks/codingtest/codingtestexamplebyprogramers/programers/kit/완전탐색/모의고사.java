package programers.kit.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
  public int[] solution(int[] answers) {


    int[] a = {1, 2, 3, 4, 5}; //5
    int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; //8
    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
    var answer = new int[]{0,0,0};

    for(var i = 0; i < answers.length; i++){
      if(answers[i] == a[i%5]){
        answer[0]++;
      }
      if(answers[i] == b[i%8]){
        answer[1]++;
      }
      if(answers[i] == c[i%10]){
        answer[2]++;
      }
    }

    int max = Arrays.stream(answer).max().getAsInt();
    var result = new ArrayList<Integer>();
    for(var i =0; i< 3; i++){
      if(answer[i] == max){
       result.add(i+1);
      }
    }

    return result.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public static void main(String[] args){
    var e = new 모의고사();

    var answers = new int[]{1,2,3,4,5};
//    var answers = new int[]{1,3,2,4,2};

    System.out.println(Arrays.toString(e.solution(answers)));
  }

}
