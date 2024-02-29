package programers.basic;

public class 원소들의곱과합 {
  public int solution(int[] num_list) {


    var sum = 0;
    var multi = 1;

    for (var i =0; i < num_list.length; i++){
      sum += num_list[i];
      multi *= num_list[i];
    }
    sum = (int)Math.pow(sum, 2);


    if(sum > multi){
      return 1;
    }
    else {
      return 0;
    }


  }

  public static void main(String[] args){
    var e = new 원소들의곱과합();

    int[] num_list = {3, 4, 5, 2, 1};
//    int[] num_list = {5, 7, 8, 3};

    System.out.println(e.solution(num_list));
  }
}
