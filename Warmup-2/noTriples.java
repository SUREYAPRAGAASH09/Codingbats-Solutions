Problem Statement :
-------------------
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    Return true if the array does not contain any triples.
    
Sample Test cases :
-------------------
  noTriples([1, 1, 2, 2, 1]) → true
  noTriples([1, 1, 2, 2, 2, 1]) → false
  noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    
My Solution :
-------------
  public boolean noTriples(int[] nums) {
    boolean noTriple = true;

    if (nums.length >= 3) {
      for (int itr=0;itr < nums.length-2;itr++) {
        if ( (nums[itr] == nums[itr+1]) && (nums[itr+1] == nums[itr+2]) && (nums[itr] == nums[itr+2]))
           noTriple = false;
      }
    }
    
    return noTriple;
  }
