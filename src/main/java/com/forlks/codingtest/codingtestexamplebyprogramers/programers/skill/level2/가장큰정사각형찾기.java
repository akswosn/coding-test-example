package com.forlks.codingtest.codingtestexamplebyprogramers.programers.skill.level2;

public class 가장큰정사각형찾기{


  public int solution(int [][]board)  {
    int answer = 0;

    var maxX = 0;
    var startX = 0;
    var startY = 0;


    for (var i = 0; i <board.length; i++){
      //시작점
      for (var x = 0; x <board[i].length; x++){
        if(board[i][x] == 1){
          if(startX == 0 && startY == 0){
            startX = x;
            startY = i;
            break;
          }
        }
      }

//      System.out.println("startX : "+startX+", startY="+ startY);
      var cX = 0;
      var nX = 0;
      for(var y = startY; y < board.length; y++){
//        System.out.println("y : "+y+", nX="+ nX);
        for(var x = startX; x < board[y].length; x++){
          if(board[y][x] == 1){
            cX++;
            nX++;
          }
          else {
            break;
          }
        }
      }

//      System.out.println("startX : "+startX+", startY="+ startY);
//      System.out.println("startX : "+cX+", startY="+ cY);
//      System.out.println(">>>>>>>>>>>>>>>>>>");
      if(answer < nX){
        answer = nX;
      }
    }

    return answer;
  }



  public static void main(String[] args){
    var e = new 가장큰정사각형찾기();

    var board = new int[][]{{0,1,1,1},{1,1,1,1}, {1,1,1,1}, {0,0,1,0}};
//    var board = new int[][]{{0,0,1,1},{1,1,1,1}};

    System.out.println(e.solution(board));


  }
}
