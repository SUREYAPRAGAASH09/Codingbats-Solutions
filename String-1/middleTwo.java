Problem Statement :
-------------------
    Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2.
          
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

My Solution 2 : 
---------------
    public String middleTwo(String str) 
    {
      String newstr = "";
      int strlen = str.length(), UpdatedStrlen = 0, ind = 0;
      if (strlen % 2 == 0)
      {
        UpdatedStrlen = (strlen/2) - 1;
        while(2>ind)
        {
          newstr += str.charAt(UpdatedStrlen);
          UpdatedStrlen += 1;
          ind += 1;
        }
      }
      return newstr;
    }
