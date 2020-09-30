Problem Statement :
-------------------
      We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


Test cases :
------------
      loneTeen(13, 99) → true
      loneTeen(21, 19) → true
      loneTeen(13, 13) → false

My Solution :
-------------
      public boolean loneTeen(int a, int b) {
        boolean ind = true;
            if ( ( a >= 13 && a <= 19 ) && ( b >= 13 && b <= 19 ) )
                ind = false;
            else if ( ( a >= 13 && a <= 19 ) || ( b >= 13 && b <= 19 ) )
              ind = true;
            else
              ind = false;
        return ind;
      }   
