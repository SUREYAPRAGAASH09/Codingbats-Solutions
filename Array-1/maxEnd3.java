
                                                              maxEnd3
Problem statement:
------------------
  Given an array of ints length 3, figure out which is larger, the first or last element in the array,
  and set all the other elements to be that value. Return the changed array.

Sample testcases:
----------------
  maxEnd3([1, 2, 3]) → [3, 3, 3]
  maxEnd3([11, 5, 9]) → [11, 11, 11]
  maxEnd3([2, 11, 3]) → [3, 3, 3]
  
My Solution:
-----------
  public int[] maxEnd3(int[] nums) 
  {
     int[] resArr = new int[nums.length];
     int max = 0;

     if (nums.length >= 3)
     {
       max = (nums[0] >= nums[nums.length-1]) ? nums[0] : nums[nums.length-1];
     }

     for (int i=0;i<nums.length;i++) resArr[i] = max;

     return resArr;
  }
