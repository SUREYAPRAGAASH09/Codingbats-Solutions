
                                                              without2
                                                              
Problem statement : 
-------------------
  Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, 
  so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
  Otherwise, return the original string unchanged.
    
Sample testcases : 
------------------
  without2("HelloHe") → "lloHe"
  without2("HelloHi") → "HelloHi"
  without2("Hi") → ""
  
My solution :
-------------
  public String without2(String str) 
  {
    int strlen = str.length();
    String newstr = "";

    if (strlen >= 4)
    {
      if ( (str.charAt(0) == str.charAt(strlen-2)) && 
         (str.charAt(1) == str.charAt(strlen-1)))
      {
        for (int i=2; i<strlen;i++) newstr += str.charAt(i);
      }
      else
      {
        newstr = str;
      }
    }
    else if (strlen == 3)
    {
      if (str.charAt(0) == str.charAt(strlen-2)) 
      {
        newstr += str.charAt(1);
      }
      else
      {
        newstr = str;
      }
    }
    else if (strlen == 1)
    {
      newstr = str;
    }
    return newstr;
  }
