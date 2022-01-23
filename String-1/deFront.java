
                                                              deFront
                                                              
Problem statement:
------------------
  Given a string, return a version without the first 2 chars.
  Except keep the first char if it is 'a' and keep the second char if it is 'b'.
  The string may be any length. Harder than it looks.
    
Sample testcases:
-----------------
  deFront("Hello") → "llo"
  deFront("java") → "va"
  deFront("away") → "aay"
  
My solution :
-------------
  public String deFront(String str) 
  {    
    String newstr = "";
    int strlen = str.length();

    if (strlen >= 2)
    {
      if (str.charAt(0) == 'a')
      {
        newstr += str.charAt(0);
      }
      if (str.charAt(1) == 'b')
      {
        newstr += str.charAt(1);
      }

      for (int i=2; i<strlen;i++) newstr += str.charAt(i);
    }
    return newstr;
  }



