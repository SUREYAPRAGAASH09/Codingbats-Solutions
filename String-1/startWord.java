
                                                              startWord
                                                              
Problem statement:
------------------
  Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its    first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
  
Sample testcases : 
------------------
  startWord("hippo", "hi") → "hi"
  startWord("hippo", "xip") → "hip"
  startWord("hippo", "i") → "h"
  
My Solution :
-------------
  public String startWord(String str, String word) 
  {
    int wordLen = word.length();
    int strLen = str.length();
    String newstr = "";
    int newIndex = 0;
    boolean hasEnterIntoLoop = false;

    if (wordLen == 1)
    {
      char ch = word.charAt(0);
      for (int i=0; i<strLen;i++)
      {
        if (str.charAt(i) == ch)
        {
          break;
        }
        else
        {
          newIndex += 1;
        }
      }
    }
    else if ((wordLen >= 2) && (strLen >= 2))
    {
      int hh = Math.abs(wordLen - wordLen);
      for (int i=1; i<wordLen;i++)
      {
        if (str.charAt(i) == word.charAt(i))
        {
          newIndex += 1;
          hasEnterIntoLoop = true;
        }
        else
        {
          newIndex = 0;
          hasEnterIntoLoop = false;
        }
      }

      if (hasEnterIntoLoop)
      {
        newIndex += 1;
      }
    }

    for (int i=0; i<newIndex; i++)
    {
      newstr += str.charAt(i);
    }
    return newstr;
  }
