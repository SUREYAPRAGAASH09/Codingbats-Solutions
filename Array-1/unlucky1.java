			
								                                                    unlucky1
                                                                  
Problem Statement : 
-------------------
  We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
  Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    
Sample testcases :
------------------
  unlucky1([1, 3, 4, 5]) → true
  unlucky1([2, 1, 3, 4, 5]) → true
  unlucky1([1, 1, 1]) → false
  
My Solution :
-------------
  public boolean unlucky1(int[] nums) 
  {
    boolean flag = false;
    for (int i=0;i<=nums.length-2;i++)
    {
      if (nums[i] == 1 && nums[i+1] == 3)
      {
        flag = true;
        break;
      }
    }
    return flag;
  }
