Problem Statement :
-------------------
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    
Sample Test cases :
-------------------
  arrayFront9([1, 2, 9, 3, 4]) → true
  arrayFront9([1, 2, 3, 4, 9]) → false
  arrayFront9([1, 2, 3, 4, 5]) → false
    
My Solution :
-------------
  public boolean arrayFront9(int[] nums) 
  {
    Boolean ContainNine = false;

    for (int itr = 0;itr < nums.length; itr++)
    {
      if ((nums[itr] == 9) && (4 > itr))
        ContainNine = true;
    }

    return ContainNine;
}
