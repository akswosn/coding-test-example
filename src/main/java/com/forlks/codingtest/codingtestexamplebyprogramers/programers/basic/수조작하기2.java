package programers.basic;

public class 수조작하기2 {
  public String solution(int[] numLog) {
    String answer = "";

    for(var i = 0; i < numLog.length-1; i++){
      var num = numLog[i+1] - numLog[i];

      switch (num){
        case 1 -> answer+= "w";
        case -1 -> answer+= "s";
        case 10 -> answer+= "d";
        case -10 -> answer += "a";
      }

    }

    return answer;
  }

  public static void main(String[] args){
    var e = new 수조작하기2();

    int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

    System.out.println(e.solution(numLog));
  }
}
