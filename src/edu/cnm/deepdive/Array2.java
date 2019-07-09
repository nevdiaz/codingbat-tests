package edu.cnm.deepdive;

public class Array2 {

//  Given an array of ints, return true if the array contains a 2 next to a 2
//  or a 4 next to a 4, but not both.


  public boolean either24(int[] nums) {
    int two = 0, four = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        two++;
      }

      if (nums[i] == 4 && nums[i + 1] == 4) {
        four++;
      }

    }

    if (two != 0 && four != 0) {
      return false;
    } else if (two != 0 || four != 0) {
      return true;
    } else {
      return false;
    }

  }

//  Given a non-empty array of ints, return a new array containing the elements from the original
//  array that come before the first 4 in the original array. The original array will contain at
//  least one 4. Note that it is valid in java to create an array of length 0.
//
//  public int[] pre4(int[] nums) {
//
//  }
//

}