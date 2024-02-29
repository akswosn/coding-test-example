package programers.basic;

public class 이어붙인수 {
  public int solution(int[] num_list) {
    var a = "";
    var b = "";

    for(var i=0; i < num_list.length;i++){
      if(num_list[i] % 2 == 0){
        b += num_list[i];
      }
      else {
        a += num_list[i];
      }
    }
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  public static void main(String[] args){
    var e = new 이어붙인수();

//    int[] numlist={3, 4, 5, 2, 1};
    int[] numlist={5, 7, 8, 3};

    System.out.println(e.solution(numlist));
  }
}
