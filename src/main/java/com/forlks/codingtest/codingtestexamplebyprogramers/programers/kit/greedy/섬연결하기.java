package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.greedy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class 섬연결하기 {

  public int solution(int n, int[][] costs) {
//    List<Integer> result = new ArrayList<>();

    var connectedIsland = new HashSet<Integer>();
    var answer = 0;
    while (connectedIsland.size() < n){
      System.out.println("connectedIsland ::: " + connectedIsland);

      if(connectedIsland.isEmpty()){
        connectedIsland.add(costs[0][0]);
      }

      var minCost = 0;
      var idx = -1;

      for(var i =0; i < costs.length; i++){
        System.out.println(i+"   ####### check "+Arrays.toString(costs[i]));
        if( (connectedIsland.contains(costs[i][0]) && !connectedIsland.contains(costs[i][1]))
        || (connectedIsland.contains(costs[i][1]) && !connectedIsland.contains(costs[i][0]))){
          if( minCost == 0 ){
            minCost = costs[i][2];
            idx = i;
          }
          else if(minCost > costs[i][2]){
            minCost = costs[i][2];
            idx = i;
          }
        }
      }
      System.out.println("#### add "+ Arrays.toString(costs[idx]));
      connectedIsland.add(costs[idx][0]);
      connectedIsland.add(costs[idx][1]);

      answer += costs[idx][2];

      costs[idx][0]=-1;
      costs[idx][1]=-1;
    }

    return answer;
  }

  public Set<Integer> getAllIsland(int[][] a){
    var allIslands = new HashSet<Integer>();
    for(var i = 0; i< a.length;i++){
      allIslands.add(a[i][0]);
      allIslands.add(a[i][1]);
    }
    return allIslands;
  }

  public static void main(String[] args) {
    var e = new 섬연결하기();

    var n = 4;
    int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};

//    int[][] test = {{0, 1, 1}, {0, 2, 2},{1, 3, 1}};
//    int[][] test2 = {{0, 1, 1}, {0, 3, 2},{2, 3, 1}};
//    System.out.println(e.isConection(test, n));
    System.out.println(e.solution(n, costs));
//    System.out.println(e.getSort(costs));
  }
}
