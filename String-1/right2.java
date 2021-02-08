Problem Statement :
-------------------
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
          
Test Cases :
------------
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
My Solution :
------------- 
   public String right2(String str) {
    int StrLen = str.length();
    return str.substring(StrLen-2, StrLen) + str.substring(0,StrLen-2);
  }
My Solution 2 :
---------------
    public String right2(String str) {
      int StrLen = str.length(), iterator = 0, exitIterator = iterator = StrLen - 2;
      String newStr = "";
      boolean exitCond = true;

      while(exitCond)
      {
        newStr = newStr + str.charAt(iterator);
        iterator+=1;

        if (iterator == StrLen)
          iterator = 0;

        if (iterator == exitIterator)
          exitCond = false;
      }
      return newStr; 
    }
