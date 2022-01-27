			
								                                                              swapEnds
                                                                  
Problem Statement : 
-------------------
  Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
    
Sample testcases :
------------------
  swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
  swapEnds([1, 2, 3]) → [3, 2, 1]
  swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
  
My Solution :
-------------
  public int[] swapEnds(int[] nums) 
  {
    int[] emptyArr = {};
    int[] resArr = new int[nums.length];

    if (nums.length ==1)
    {
      resArr[0] = nums[0];
    }
    else if (nums.length >= 2)
    {
      resArr[0] = nums[nums.length - 1];
      for (int i=1;i<nums.length-1;i++)
      {
        resArr[i] = nums[i];
      }
      resArr[resArr.length-1] = nums[0];
    }
    return resArr;
  }

