											                                                  start1
                                                                  
Problem Statement : 
-------------------
  Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    
Sample testcases :
------------------
  start1([1, 2, 3], [1, 3]) → 2
  start1([7, 2, 3], [1]) → 1
  start1([1, 2], []) → 1
  
My Solution :
-------------
  public int start1(int[] a, int[] b) 
  {
    int Cnt = 0;
    if ((a.length > 0) && (a[0] == 1))
    {
      Cnt += 1;
    }

    if ((b.length > 0) && (b[0] == 1))
    {
      Cnt += 1;
    }
    return Cnt;
  }

