package programers.basic;

public class 수조작하기1 {
  public int solution(int n, String control) {
    int answer = n;

    for (var i = 0; i < control.length(); i++){
      switch (control.charAt(i)){
        case 'w' -> answer +=1;
        case 's' -> answer -=1;
        case 'd' -> answer +=10;
        case 'a' -> answer -=10;
      }
//      System.out.println(answer);
    }

    return answer;
  }

  public static void main(String[] args){
    var e = new 수조작하기1();

    var n = 0;
    var control = "wsdawsdassw";

    System.out.println(e.solution(n, control));
  }
}
