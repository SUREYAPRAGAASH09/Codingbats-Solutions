Problem Statement :
-------------------
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
          
Test Cases :
------------
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
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

My Solution 3: 
--------------
   public String right2(String str) 
   {
      String newStr = "";
      int strlen = str.length();

      if (strlen >= 3)
      {
        newStr += str.charAt(strlen-2);
        newStr += str.charAt(strlen-1);

        for (int i=0;i < strlen-2;i++)
          newStr += str.charAt(i);
      }
      else
        newStr = str;

      return newStr;
    }

