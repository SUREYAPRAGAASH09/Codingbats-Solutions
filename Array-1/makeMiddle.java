											                                                    
                                                                    makeMiddle
                                                                  
Problem Statement : 
-------------------
  Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
  The original array will be length 2 or more.

Sample testcases :
------------------
  makeMiddle([1, 2, 3, 4]) → [2, 3]
  makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
  makeMiddle([1, 2]) → [1, 2]
  
My Solution :
-------------
  public int[] makeMiddle(int[] nums) 
  {
    int[] resArr = new int[2];
    resArr[0] = nums[(nums.length/2)-1];
    resArr[1] = nums[(nums.length/2)];
    return resArr;
  }

