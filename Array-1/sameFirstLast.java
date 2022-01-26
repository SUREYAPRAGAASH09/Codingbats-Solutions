
                                                          sameFirstLast
                                                          
Problem statement : 
-------------------
  Given an array of ints, return true if the array is length 1 or more,
  and the first element and the last element are equal.
    
Sample testcases : 
------------------
  sameFirstLast([1, 2, 3]) → false
  sameFirstLast([1, 2, 3, 1]) → true
  sameFirstLast([1, 2, 1]) → true
  
My Solution :
-------------
  public boolean sameFirstLast(int[] nums) 
  {
    int len = nums.length;
    boolean flag = false;
    if (len >= 2)
    {
      if (nums[0] == nums[len-1])
      {
        flag = true;
      }
    }
    else if (len == 1)
    {
      flag = true;
    }
    return flag;
  }
