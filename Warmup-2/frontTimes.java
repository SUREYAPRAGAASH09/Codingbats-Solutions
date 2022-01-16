Problem Statement :
-------------------
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or 
    whatever is there if the string is less than length 3. 
    Return n copies of the front;
    
Sample Test cases :
-------------------
    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
    
My Solution :
-------------
    public String frontTimes(String str, int n) 
    {
      int strlen = str.length();
      String subStringOfStr = "", newStr = "";
      subStringOfStr = (strlen > 3) ? str.substring(0, 3) : str;

      for (int itr = 1; itr <= n; itr ++)
        newStr = newStr + subStringOfStr;

      return newStr; 
    }

My Second Solution : 
--------------------
    public String frontTimes(String str, int n) 
    {
      String front = "";
      String newStr = "";
      for (int i=0; i<str.length(); i++)
      {
        front = front + Character.toString(str.charAt(i));
        if (i == 2) break;
      }

      for (int i=0; i<n; i++)
      {
        newStr = newStr + front;
      }
      return newStr;
    }
