package programers.basic;

public class 주사위게임2 {
  public int solution(int a, int b, int c) {
    int answer = 0;
    if(a == b && a ==c){ //모두 같음
      var add = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
      var add2 = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
      answer = (a+b+c) * add * add2;
    }
    else if(a == b || a == c || b == c){ //2수 같음
      var add = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
      answer = (a+b+c) * add;
    }
    else { // 모두 다름
      answer = a+b+c;
    }


    return answer;
  }

  public static void main(String[] args){
    var e = new 주사위게임2();

//    var a = 2;
//    var b = 6;
//    var c = 1;

    var a = 5;
    var b = 3;
    var c = 3;

//    var a = 4;
//    var b = 4;
//    var c = 4;

    System.out.println(e.solution(a,b,c));
  }
}
