
                                                            min cat
                                                            
Problem statement : 
--------------------
  Given two strings, append them together (known as "concatenation") and return the result. 
  However, if the strings are different lengths, omit chars from the longer string so it 
  is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    
sample testcases : 
------------------
  minCat("Hello", "Hi") → "loHi"
  minCat("Hello", "java") → "ellojava"
  minCat("java", "Hello") → "javaello"
  
My Solution :
-------------
  public String minCat(String a, String b) 
  {
    String newstr = "";
    int strlen1 = a.length();
    int strlen2 = b.length();

    if (strlen1 > strlen2)
    {
      for (int i=(strlen1-strlen2); i<strlen1;i++)
      {
        newstr += a.charAt(i);
      }
      newstr += b;
    }
    else
    {
      newstr = a;
      for (int i=(strlen2-strlen1); i<strlen2;i++)
      {
        newstr += b.charAt(i);
      }
    }
    return newstr;
  }
