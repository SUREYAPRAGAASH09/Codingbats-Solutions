
                                                          firstLast6
                                                          
Problem statement : 
--------------------
  Given an array of ints, return true if 6 appears as either the first or 
  last element in the array. The array will be length 1 or more.
    
Sample testcases : 
------------------
  firstLast6([1, 2, 6]) → true.
  firstLast6([6, 1, 2, 3]) → true.
  firstLast6([13, 6, 1, 2, 3]) → false.
  
My solution :
-------------
  public boolean firstLast6(int[] nums) 
  {
    return (nums[0] == 6 || nums[nums.length-1] == 6) ? true : false;
  }
