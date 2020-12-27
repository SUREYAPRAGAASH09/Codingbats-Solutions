Problem statement :
-------------------
      Given a string, return a new string where the last 3 chars are now in upper case. 
      If the string has less than 3 chars, uppercase whatever is there.
      Note that str.toUpperCase() returns the uppercase version of a string.
      
Sample  Test case :
-------------------
      endUp("Hello") → "HeLLO"
      endUp("hi there") → "hi thERE"
      endUp("hi") → "HI"
      
My Solution :
-------------
      public String endUp(String str) 
      {
          int RunUpTo = 1, strlen = str.length();
          char[] chars = str.toCharArray();

          if (!(strlen <= 0))
          {
            if (strlen >= 3)
              RunUpTo = 3;
            else if (strlen >= 2)
              RunUpTo = 2;

            for (int itr = 1; itr <= RunUpTo; itr ++)
              chars[strlen - itr] = Character.toUpperCase(str.charAt(strlen - itr));   
          }
     }
