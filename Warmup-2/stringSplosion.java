Problem Statement :
-------------------
    Given a non-empty string like "Code" return a string like "CCoCodCode".
    
Sample Test cases :
-------------------
   stringSplosion("Code") → "CCoCodCode"
   stringSplosion("abc") → "aababc"
   stringSplosion("ab") → "aab"
    
My Solution :
-------------
  public String stringSplosion(String str) 
  {
    int strLenCnt = 0, innerLoopCnt = 0, strLen = str.length()-1;
    String newStr = "";

    while (strLen >= strLenCnt)
    {
      innerLoopCnt = 0;
      while (strLenCnt >= innerLoopCnt)
      {
        newStr = newStr + Character.toString(str.charAt(innerLoopCnt));
        innerLoopCnt += 1;
      }
      strLenCnt += 1;
    }
    return newStr;
  }

My Solution 2 :
---------------
    public String stringSplosion(String str) 
    {
      int strLenCnt = 0, strLen = str.length()-1;
      String newStr = "";

      while (strLen >= strLenCnt)
      {
        newStr = newStr + str.substring(0,strLenCnt+1);
        strLenCnt += 1;
      }

      return newStr;
    }

