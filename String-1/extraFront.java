
                                                        extra Front
                                                        
Problem statement : 
-------------------
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
  
Sample Testcases : 
------------------
  extraFront("Hello") → "HeHeHe"
  extraFront("ab") → "ababab"
  extraFront("H") → "HHH"
  
My Solution : 
------------
  public String extraFront(String str) 
  {
    int strlen = str.length();
    String newstr = "";

    if (strlen >= 2)
    {
      newstr += str.charAt(0);
      newstr += str.charAt(1);
    }
    else
    {
      newstr += str;
    }
    return newstr + newstr + newstr;
  }
