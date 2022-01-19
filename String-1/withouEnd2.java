Problem Statement :
-------------------
    Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
          
Test Cases :
------------
    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
    
My Solution :
------------- 
    public String withouEnd2(String str) {
    return (str.length() >= 3) ? str.substring(1, str.length()-1)  : "" ;
  }
My Solution 2:
--------------
    public String withouEnd2(String str) {
      String newStr = ""; int length = str.length();
      for(int iterator = 1; length-1 > iterator; iterator++)
        newStr = newStr + str.charAt(iterator);

      return newStr;
    }

My Solution 3 : 
---------------
    public String withouEnd2(String str) 
    {
      String newStr = "";
      int strlen = str.length();

      if (strlen >= 3)
      {
        for (int i=1; i<strlen-1; i++)
          newStr += str.charAt(i);
      }
      return newStr;
    }
