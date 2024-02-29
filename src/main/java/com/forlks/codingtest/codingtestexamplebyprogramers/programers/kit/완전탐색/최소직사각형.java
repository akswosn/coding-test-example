package programers.kit.완전탐색;

public class 최소직사각형 {
  public int solution(int[][] sizes) {

    // default Max
    var orderSizes = orderXY(sizes);
//    System.out.println(Arrays.toString(orderSizes));
    var result = getMax(orderSizes);


    return result[0] * result[1];
  }

  public int[][] orderXY(int[][] sizes){
    var result = new int[sizes.length][2];

    for(var i =0; i < sizes.length;i++){
      if(sizes[i][0] > sizes[i][1]){
        result[i][0] = sizes[i][0];
        result[i][1] = sizes[i][1];
      }
      else {
        result[i][0] = sizes[i][1];
        result[i][1] = sizes[i][0];
      }
    }


    return result;
  }

  public int[] getMax(int[][] sizes){
    var result = new int[]{0,0};

    for (var data: sizes){
      if(data[0] > result[0]){
        result[0] = data[0];
      }
      if(data[1] > result[1]){
        result[1] = data[1];
      }
    }
    return result;
  }



  public static void main(String[] args){
    var e = new 최소직사각형();

//    var sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    var sizes = new int[][]{{10, 7},{12, 3},{8, 15},{14, 7},{5, 15}};

    System.out.println(e.solution(sizes));
  }
}
