			
								                                                        front11
                                                                  
Problem Statement : 
-------------------
  Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
  If either array is length 0, ignore that array.

    
Sample testcases :
------------------
  front11([1, 2, 3], [7, 9, 8]) → [1, 7]
  front11([1], [2]) → [1, 2]
  front11([1, 7], []) → [1]
  
My Solution :
-------------
  public int[] front11(int[] a, int[] b) 
  {
    int[] resArr = new int[1];
    int[] resArr2 = new int[2];
    int[] emptyArr = {};
    int hasEntered = 0, IsDoubleEle = 0;
    if (a.length > 0)
    {

      resArr[0] = a[0];
    }
    else if (b.length >0)
    {

      resArr[0] = b[0];
      hasEntered = 1;
    }

    if ((b.length > 0) && (hasEntered == 0))
    {
      IsDoubleEle = 1;
      if (a.length >0)
      {
        resArr2[0] = a[0];
      }
      resArr2[1] = b[0];
    }

    if (a.length > 0 || b.length > 0)
    {
      if (IsDoubleEle == 1)
      {
        return resArr2;  
      }
      else
      {
        return resArr;
      }
    }
    else
    {
      return emptyArr;
    }
  }
