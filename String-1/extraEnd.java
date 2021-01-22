Problem Statement :
-------------------
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
          
Test Cases :
------------
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
My Solution :
------------- 
    public String extraEnd(String str) {
      int StrLen = str.length();
      String tempStr = "";
      if (StrLen <= 2)
        tempStr = str ;
      else if (StrLen > 2)
        tempStr = str.substring(StrLen-2, StrLen);

      return tempStr + tempStr + tempStr; 
    }

My Solution 2 : 
---------------
       public String extraEnd(String str) {
          int StrLen = str.length();
          String tempStr = (StrLen <= 2) ? str : str.substring(StrLen-2, StrLen);
          return tempStr + tempStr + tempStr; 
        }
