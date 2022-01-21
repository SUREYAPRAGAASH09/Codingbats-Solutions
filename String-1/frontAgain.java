
                                                          front Again
                                                          
Problem statement : 
-------------------
  Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    
Sample testcases : 
------------------
  frontAgain("edited") → true
  frontAgain("edit") → false
  frontAgain("ed") → true
  
My Solution 1: 
--------------
  public boolean frontAgain(String str) 
  {
    boolean flag = false;
    int strlen = str.length();
    if (strlen >= 4)
    {
      if ((str.charAt(0) == str.charAt(strlen-2)) && (str.charAt(1) == str.charAt(strlen-1)))
      {
        flag = true;
      }
    }
    else if (strlen >= 3)
    {
      if ((str.charAt(0) == str.charAt(strlen-1)))
      {
        flag = true;
      }
    }
    else if (strlen >= 2)
    {
      flag = true;
    }
    return flag;
  }
