Problem Statement :
-------------------
        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
        Note that Math.abs(n) returns the absolute value of a number.

Test cases :
------------
      close10(8, 13) → 8
      close10(13, 8) → 8
      close10(13, 7) → 0

My Solution :
------------
      public int close10(int a, int b) {
          return (Math.abs(10 - a) > Math.abs(10 - b)) ? b : (Math.abs(10 - a) < Math.abs(10 - b)) ? a : 0;  
      }
