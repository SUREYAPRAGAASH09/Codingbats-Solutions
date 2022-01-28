			
								                                                        make2
                                                                  
Problem Statement : 
-------------------
  Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
  the elements from a followed by the elements from b. The arrays may be any length,
  including 0, but there will be 2 or more elements available between the 2 arrays.


    
Sample testcases :
------------------
  make2([4, 5], [1, 2, 3]) → [4, 5]
  make2([4], [1, 2, 3]) → [4, 1]
  make2([], [1, 2]) → [1, 2]
  
My Solution :
-------------
  public int[] make2(int[] a, int[] b)
  {
    int hasEntered = 0;
    int[] resArr = new int[2];
    int eleCnt = 0;

    if (a.length > 0)
    {
      for (int i=0;i<a.length;i++)
      {
        resArr[i] = a[i];
        eleCnt += 1;
        if (eleCnt == 2)
        {
          hasEntered = 1;
          break;
        }
      }
    }

    if ((b.length > 0) && (hasEntered == 0))
    {
      for (int i=0;i<b.length;i++)
      {
        resArr[eleCnt] = b[i];
        eleCnt += 1;
        if (eleCnt == 2)
        {
          break;
        }
      }
    }
    return resArr;
  }
