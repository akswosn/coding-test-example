package programers.kit.완전탐색;

public class 소수찾기 {

  public int solution(String numbers) {
    int answer = 0;

    for(var charLen =1; charLen <= numbers.length(); charLen++){


    }

    return answer;
  }

//  public void


  public boolean isPrime(int n){
    if(2 > n){
      return false;
    }
    else if(n == 2){
      return true;
    }

    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) // 소수가 아닐 경우
        return false;
    }

    return true;
  }



  public static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args){
    var e = new 소수찾기();

    var numbers = "17";
//    var numbers = "011";
//    System.out.println(e.solution(numbers));


  }

}
