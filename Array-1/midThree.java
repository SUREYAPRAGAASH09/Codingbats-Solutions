			
								                                                          midThree
                                                                  
Problem Statement : 
-------------------
  Given an array of ints of odd length, return a new array length 3 
  containing the elements from the middle of the array. The array length will be at least 3.
    
Sample testcases :
------------------
  midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
  midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
  midThree([1, 2, 3]) → [1, 2, 3]
  
My Solution :
-------------
  public int[] midThree(int[] nums) 
  {
    int[] emptyArr = {};
    int[] resArr = new int[3];
    if (nums.length >= 3)
    {
      resArr[0] = nums[(nums.length/2) - 1];
      resArr[1] = nums[(nums.length/2)];
      resArr[2] = nums[(nums.length/2) + 1];

      return resArr;
    }
    else
    {
      return emptyArr;
    }
  }
