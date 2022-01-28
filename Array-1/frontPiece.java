			
								                                                        frontPiece
                                                                  
Problem Statement : 
-------------------
  Given an int array of any length, return a new array of its first 2 elements.
  If the array is smaller than length 2, use whatever elements are present.
    
Sample testcases :
------------------
  frontPiece([1, 2, 3]) → [1, 2]
  frontPiece([1, 2]) → [1, 2]
  frontPiece([1]) → [1]
  
My Solution :
-------------
  public int[] frontPiece(int[] nums) 
  {
    int[] resArr1 = new int[2];
    int[] resArr2 = new int[1];
    int[] emptyArr = {};

    if (nums.length >= 2)
    {
      resArr1[0] = nums[0];
      resArr1[1] = nums[1];
      return resArr1;
    }
    else if (nums.length == 1)
    {
      resArr2[0] = nums[0];
      return resArr2;
    }
    else 
    {
      return emptyArr;
    }
  }
