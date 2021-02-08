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
