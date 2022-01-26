
                                                          sum2
                                                          
Problem Statement:
------------------
  Given an array of ints, return the sum of the first 2 elements in the array.
  If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    
Sample testcases: 
-----------------
  sum2([1, 2, 3]) → 3
  sum2([1, 1]) → 2
  sum2([1, 1, 1, 1]) → 2
  
My Solution :
-------------
  public int sum2(int[] nums) 
  {
    int sum = 0;

    if (nums.length >= 2)
      sum = nums[0] + nums[1];
    else if (nums.length == 1)
      sum = nums[0];
    else if (nums.length == 0)
      sum = 0;

    return sum;
  }

