Problem Statement :
-------------------
    Given a string, return the count of the number of times that a substring length 2 
    appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    
Sample Test cases :
-------------------
   last2("hixxhi") → 1
   last2("xaxxaxaxx") → 1
   last2("axxxaaxx") → 2
    
My Solution :
-------------
  public int last2(String str)
  {
    int strLen =  str.length(), itr = 0,SecondCharItr = 0, CountLast2 = 0;
    if (strLen >= 2)
    {
      String lastTwoChar = str.substring(strLen-2,strLen);
      char[] ch = lastTwoChar.toCharArray();
      strLen = strLen - 3;
      while (strLen >= itr)
      {
        SecondCharItr = itr + 1;
        if ((ch[0] == str.charAt(itr)) && (ch[1] == str.charAt(SecondCharItr)))
          CountLast2 += 1;
        itr += 1;
      }
    }
    return CountLast2;
  }
