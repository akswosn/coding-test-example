package programers.basic;

import java.util.Arrays;

public class 마지막두원소 {
  public int[] solution(int[] num_list) {

    var a = 0;

    if(num_list[num_list.length-1] > num_list[num_list.length-2]){
      a = num_list[num_list.length-1] - num_list[num_list.length-2];
    }
    else {
      a = num_list[num_list.length-1] * 2;
    }
    var answer = Arrays.copyOf(num_list, num_list.length+1);
    answer[answer.length-1] = a;
    return answer;
  }


  public static void main(String[] args){
    var e = new 마지막두원소();

//    int[] num_list = {2,1,6};
    int[] num_list = {5, 2, 1, 7, 5};

    System.out.println(Arrays.toString(e.solution(num_list)));
  }
}
