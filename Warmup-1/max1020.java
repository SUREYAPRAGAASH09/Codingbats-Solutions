Problem Statement :
-------------------
      Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
      or return 0 if neither is in that range.

Test cases :
------------
      max1020(11, 19) → 19
      max1020(19, 11) → 19
      max1020(11, 9) → 11
      
My Solution :
-------------
      public int max1020(int a, int b) {
  
      a = ( a >= 10 && a <= 20 ) ? a : 0; 
      b = ( b >= 10 && b <= 20 ) ? b : 0; 
      return (a > b) ? a : b; 
    }
 
