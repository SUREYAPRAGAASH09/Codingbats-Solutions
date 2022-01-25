
                                                                rotateLeft3
                                                                
Problem statement:
------------------
  Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

Sample testcases:
-----------------
  rotateLeft3([1, 2, 3]) → [2, 3, 1].
  rotateLeft3([5, 11, 9]) → [11, 9, 5].
  rotateLeft3([7, 0, 0]) → [0, 0, 7].
  
My solution:
------------
  public int[] rotateLeft3(int[] nums) 
  {
    int[] rotatedArr = new int[nums.length];
    int temp = 0;
    for (int i=0;i<nums.length;i++)
    {
      if (i == 0) 
      {
        temp = nums[i];
      }
      else
      {
        rotatedArr[i-1] = nums[i];
      }
    }
    rotatedArr[rotatedArr.length-1] = temp;
    return rotatedArr;
  }
