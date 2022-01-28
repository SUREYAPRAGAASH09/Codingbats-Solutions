			
								                                                        maxTriple
                                                                  
Problem Statement : 
-------------------
  Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
  The array length will be a least 1.
    
Sample testcases :
------------------
  maxTriple([1, 2, 3]) → 3
  maxTriple([1, 5, 3]) → 5
  maxTriple([5, 2, 3]) → 5
  
My Solution :
-------------
  public int maxTriple(int[] nums) 
  {
    int max = 0, firstEle = 0, midEle = 0, lstEle = 0;
    if (nums.length == 1)
    {
      max = nums[0];
    }
    else if (nums.length == 2)
    {
      max = (nums[0] > nums[1]) ? nums[0] : nums[1];
    }
    else if (nums.length >= 3)
    {
      firstEle = nums[0];
      midEle = nums[(nums.length / 2)];
      lstEle = nums[(nums.length-1)];

      if ((firstEle>midEle)&&(firstEle>lstEle))
      {
        max = firstEle;
      }
      else if ((midEle>firstEle)&&(midEle>lstEle))
      {
        max = midEle;
      }
      else 
      {
        max = lstEle;
      }
    }
    return max;
  }
