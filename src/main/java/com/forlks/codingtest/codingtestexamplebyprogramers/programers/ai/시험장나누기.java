package com.forlks.codingtest.codingtestexamplebyprogramers.programers.ai;

import java.util.PriorityQueue;

public class 시험장나누기 {
  public int solution(int k, int[] num, int[][] links) {
    int answer = 0;

    for(var i =0; i < num.length; i++){

    }


    return answer;
  }

  public static void main(String[] args){
    var e = new 시험장나누기();

    var k = 3;
    int[] num = {12, 30, 1, 8, 8, 6, 20, 7, 5, 10, 4, 1};
    int[][] links = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {8, 5}, {2, 10}, {3, 0}, {6, 1}, {11, -1}, {7, 4}, {-1, -1}
        , {-1, -1}};

    System.out.println(e.solution(k, num, links));


  }
}

class Node {
  private Node left;
  private Node right;
  private int value;

  public Node(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }
}
