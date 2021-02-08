Problem Statement :
-------------------
    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
          
Test Cases :
------------
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
    
My Solution :
------------- 
   public String middleTwo(String str) {
      return (str.length() % 2 == 0) ? str.substring((str.length() / 2) - 1, (str.length() / 2) + 1) : "";
  }
