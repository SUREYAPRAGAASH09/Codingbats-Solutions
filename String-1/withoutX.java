
                                                                  withoutX
                                                                  
Problem statement : 
-------------------
  Given a string, if the first or last chars are 'x', 
  return the string without those 'x' chars, and otherwise return the string unchanged.
    
Sample Testcases : 
------------------
  withoutX("xHix") → "Hi"
  withoutX("xHi") → "Hi"
  withoutX("Hxix") → "Hxi"
  
My Solution :
-------------
  public String withoutX(String str) 
  {
    int strlen = str.length(), beginIndex = 0, EndIndex = 0;
    String newstr = "";
    if (strlen >= 2)
    {
      beginIndex = (str.charAt(0) == 'x') ? 1 : 0;
      EndIndex = (str.charAt(strlen-1) == 'x') ? strlen-2 : strlen-1;
      for (int i=beginIndex;i<=EndIndex;i++) newstr += str.charAt(i);
    }
    else if (strlen == 1)
    {
       newstr = (str.charAt(0) == 'x') ? "" : str;
    }
    else
    {
      newstr = str;
    }
    return newstr;
  }
