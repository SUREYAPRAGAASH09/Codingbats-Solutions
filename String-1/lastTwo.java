
                                                                  last Two
                                                                  
problem statement : 
--------------------
    Given a string of any length, return a new string where the last 2 chars, 
    if present, are swapped, so "coding" yields "codign".
      
Sample testcases : 
------------------
    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
  
My Solution : 
-------------
  public String lastTwo(String str) 
  {
    int strlen = str.length();
    String newstr = "";
    if (strlen >= 3)
    {
      for (int i=0;i<strlen-2;i++)
      {
        newstr += str.charAt(i);
      }
      newstr += str.charAt(strlen-1);
      newstr += str.charAt(strlen-2);
    }
    else if (strlen == 2)
    {
      newstr += str.charAt(strlen-1);
      newstr += str.charAt(strlen-2);
    }
    else
    {
      newstr = str;
    }
    return newstr;
  }
