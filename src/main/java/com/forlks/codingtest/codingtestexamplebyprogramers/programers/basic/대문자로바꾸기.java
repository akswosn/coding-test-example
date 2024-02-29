package programers.basic;

public class 대문자로바꾸기 {

  public String solution(String myString) {
    return myString.toUpperCase();
  }

  public static void main(String[] args){
    var e = new 대문자로바꾸기();
    var myString = "aBcDeFg";

    System.out.println(e.solution(e.solution(myString)));
  }

}
