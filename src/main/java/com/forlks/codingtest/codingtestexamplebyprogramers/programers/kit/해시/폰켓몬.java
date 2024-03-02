package com.forlks.codingtest.codingtestexamplebyprogramers.programers.kit.해시;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 폰켓몬 {

  public int solution(int[] nums) {
    var num = nums.length /2;
    var set = new HashSet<Integer>();

    for (int n : nums) {
      set.add(n);
    }

    return num < set.size() ? num : set.size();
  }

  public static void main(String[] args) {
    var e = new 폰켓몬();

      int[] nums = {3,1,2,3};
//    int[] nums = {3,3,3,2,2,4};
//    int[] nums = {3, 3, 3, 2, 2, 2};

    System.out.println(e.solution(nums));
  }
}
