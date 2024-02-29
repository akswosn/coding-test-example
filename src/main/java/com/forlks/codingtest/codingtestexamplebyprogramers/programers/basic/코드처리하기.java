package programers.basic;

public class 코드처리하기 {
  public String solution(String code) {
    var mode = 0;
    var ret = "";

    for (var i = 0; i < code.length();i++){
      if('1' == code.charAt(i)){
        if(mode == 0){
          mode = 1;
        }
        else {
          mode = 0;
        }
        continue;
      }

      if(mode == 1){
        if(i % 2 == 1){
          ret += code.charAt(i);
        }
      }
      else {
        if(i % 2 == 0){
          ret += code.charAt(i);
        }
      }
    }

    if(ret.length() == 0){
      return "EMPTY";
    }

    return ret;
  }

  public static void main(String[] args){
    var e = new 코드처리하기();
    var code = "abc1abc1abc";

    System.out.println(e.solution(code));
  }
}
