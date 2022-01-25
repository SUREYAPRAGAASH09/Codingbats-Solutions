
                                                                withoutX2
                                                                
Problem Statement : 
-------------------
  Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
  and otherwise return the string unchanged. This is a little harder than it looks.
    
Sample Testcases : 
------------------
  withoutX2("xHi") → "Hi"
  withoutX2("Hxi") → "Hi". 
  withoutX2("Hi") → "Hi"
  
My Solution :
-------------
  public String withoutX2(String str) 
  {
    int strlen = str.length();
    String newstr = "";
    int i = 0, itr = 0;
    int hasAlreadyEntered = 0;
    if (strlen >= 2)
    {
      if (str.charAt(0) == 'x') 
      {
        i += 1;
        hasAlreadyEntered = 1;
      }

      if (str.charAt(1) == 'x')
      {
        if (hasAlreadyEntered == 0)
        {
          newstr += str.charAt(i);
          i += 2;
        }
        else
          i += 1;
      }
      for (itr=i; itr<str.length();itr++) newstr += str.charAt(itr);

    }
    return newstr;
  }

