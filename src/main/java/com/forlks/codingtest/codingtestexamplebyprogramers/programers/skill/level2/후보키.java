package programers.skill.level2;

public class 후보키 {
  public int solution(String[][] relation) {
    int answer = 0;
    var keyLen = 1;
    for(var i = 0; i < relation.length; i++){

    }

    return answer;
  }

  public static void main(String[] args){
    var e = new 후보키();

//    var releation = new String[][]{{"100","ryan","music","2"}, {"200","apeach","math","2"}};
    var releation = new String[][]{{"100","ryan","music","2"}, {"200","apeach","math","2"},
        {"300","tube","computer","3"}, {"400","con","computer","4"},
        {"500","muzi","music","3"}, {"600","apeach","music","2"}};
    System.out.println(e.solution(releation));
  }
}
