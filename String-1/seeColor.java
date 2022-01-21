
                                                                  see Color
                                                                  
Problem statement : 
-------------------
    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
      
Sample testcases : 
------------------
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
  
My Solution : 
--------------
    public String seeColor(String str) 
    {
      int strlen = str.length();
      String newstr = "";
      if (strlen >= 3)
      {
        if (str.charAt(0) == 'r' && str.charAt(1) == 'e' && str.charAt(2) == 'd')
        {
          newstr = "red";
        }
      }

      if (strlen >= 4)
      {
        if (str.charAt(0) == 'b' && str.charAt(1) == 'l' && str.charAt(2) == 'u' && str.charAt(3) == 'e')
        {
          newstr = "blue";
        }
      }
      return newstr;
    }
