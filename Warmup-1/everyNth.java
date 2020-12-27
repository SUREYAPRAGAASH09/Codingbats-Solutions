Problem Statement :
-------------------
    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

Sample Test cases :
-------------------
    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
    
My Solution :
-------------
    public String everyNth(String str, int n) 
    {
      int stepCnt = 0, strlen = str.length() - 1;
      String newstr = "";

      while (strlen >= stepCnt)
      {
        newstr = newstr + str.charAt(stepCnt);
        stepCnt = stepCnt + n;
      }

      return newstr;
    }
