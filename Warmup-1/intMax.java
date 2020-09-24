Problem Statement :
-------------------
    Given three int values, a b c, return the largest.

Test Cases :
------------
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
    
My Solution :
-------------
    public int intMax(int a, int b, int c) {
      int max;
      if ((a>b) && (a>c))
          max = a;
      else if ((b>c)  && (b>a))
          max = b;
      else
          max = c;
      return max;
     }
My Solution 2 : [Code optimized too much]
---------------
    public int intMax(int a, int b, int c) {
       return ((a>b) && (a>c)) ? a : ((b>c)  && (b>a)) ? b : c; 
    }
