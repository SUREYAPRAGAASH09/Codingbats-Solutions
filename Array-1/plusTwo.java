			
								                                                            plusTwo
                                                                  
Problem Statement : 
-------------------
  Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    
Sample testcases :
------------------
  plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
  plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
  plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
  
My Solution :
-------------
  public int[] plusTwo(int[] a, int[] b) 
  {
    int[] resArr = new int[4];int i = 0,  itr = -1;
    for (;i<a.length;i++)
    {
      itr += 1;
      resArr[itr] = a[i];
    }

    for (i=0;i<b.length;i++)
    {
      itr += 1;
      resArr[itr] = b[i];
    }
    return resArr;
  }

