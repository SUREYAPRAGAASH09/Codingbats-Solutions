
                                                                  no23
                                                                  
Problem Statement : 
-------------------
  Given an int array length 2, return true if it does not contain a 2 or 3.
    
Sample testcases :
------------------
  no23([4, 5]) → true
  no23([4, 2]) → false
  no23([3, 5]) → false
  
My Solution :
-------------
  public boolean no23(int[] nums) 
  {
    boolean flag = true;
    if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3)) flag = false;
    return flag;
  }

