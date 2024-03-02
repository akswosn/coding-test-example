package com.forlks.codingtest.codingtestexamplebyprogramers.programers.skill.level1;

import java.util.Arrays;

public class 문제2_0302 {

  public int[] solution(String[] wallpaper) {
    var lux = -1;
    var luy = -1;
    var rdx = -1;
    var rdy = -1;

    for (var i= 0;  i < wallpaper.length; i++) {
      var page = wallpaper[i];

      while (page.indexOf("#") > -1){
        var y = page.indexOf("#");
        var x = i;

        page = page.replaceFirst("#", ".");

        if (lux == -1) {
          lux = x;
          luy = y;
          rdx = x + 1;
          rdy = y + 1;
        } else {
          if (lux > x) {
            lux = x;
          }
          if (luy > y) {
            luy = y;
          }
          if (rdx < x+1) {
            rdx = x+1;
          }
          if (rdy < y+1) {
            rdy = y+1;
          }
        }
      }
    }

    return new int[]{lux, luy, rdx, rdy};
  }


  public static void main(String[] args){
    var e = new 문제2_0302();

//    String[] wallpaper = {".#...", "..#..", "...#."};
    String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

    System.out.println(Arrays.toString(e.solution(wallpaper)));
  }
}
