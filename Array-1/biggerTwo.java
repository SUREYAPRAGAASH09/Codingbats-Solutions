											                                                biggerTwo
                                                                  
Problem Statement : 
-------------------
  Start with 2 int arrays, a and b, each length 2.
  Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
    
Sample testcases :
------------------
  biggerTwo([1, 2], [3, 4]) → [3, 4]
  biggerTwo([3, 4], [1, 2]) → [3, 4]
  biggerTwo([1, 1], [1, 2]) → [1, 2]
  
My Solution :
-------------
  public int[] biggerTwo(int[] a, int[] b) 
  {
    int aValues = a[0] + a[1];
    int bValues = b[0] + b[1];

    if ((aValues > bValues) || (aValues == bValues) )
    {
      return a;
    }
    else
    {
      return b;
    }
  }

