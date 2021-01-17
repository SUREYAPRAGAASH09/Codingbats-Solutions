Problem Statement :
-------------------
    Given an array of ints, return the number of times that two 6's are next to each other in the array. 
    Also count instances where the second "6" is actually a 7.
    
Sample Test cases :
-------------------
  array667([6, 6, 2]) → 1
  array667([6, 6, 2, 6]) → 1
  array667([6, 7, 2, 6]) → 1
    
My Solution :
-------------
  public int array667(int[] nums) {
    int cnt = 0;
    for (int itr=0; itr < nums.length-1; itr ++) {
      if (((nums[itr] == 6) && (nums[itr+1] == 6)) || ((nums[itr] == 6) && (nums[itr+1] == 7)))
          cnt += 1;
    }
    return cnt;
  }
