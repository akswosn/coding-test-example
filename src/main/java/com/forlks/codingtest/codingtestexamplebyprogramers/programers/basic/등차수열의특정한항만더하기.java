package programers.basic;

public class 등차수열의특정한항만더하기 {
  public int solution(int a, int d, boolean[] included) {
    int answer = 0;

    for(var i = 0; i < included.length; i++){
      if(included[i]){
        answer += (a + (i*d));
      }
//      System.out.println("[ i="+i+",  ] ::: answer="+answer);
    }

    return answer;
  }

  public static void main(String[] args){
    var e = new 등차수열의특정한항만더하기();
//    var a = 3;
//    var d = 4;
//    var included = new boolean[]{true, false, false, true, true};

    var a = 7;
    var d = 1;
    var included = new boolean[]{false, false, false, true, false, false, false};

    System.out.println(e.solution(a,d,included));
  }
}
