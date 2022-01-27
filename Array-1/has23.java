
                                                                      has23
                                                                      
Problem Statement:
-----------------
  Given an int array length 2, return true if it contains a 2 or a 3.
    
Sample testcases:
-----------------
  has23([2, 5]) → true
  has23([4, 3]) → true
  has23([4, 5]) → false
  
My Solution :
-------------
  public boolean has23(int[] nums) 
  {
    boolean flag = false;
    if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3)) flag = true;
    return flag;
  }
