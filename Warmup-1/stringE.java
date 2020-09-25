Problem Statement :
-------------------
    Return true if the given string contains between 1 and 3 'e' chars.

Test cases :
------------
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
    
My Solution :
-------------
    public boolean stringE(String str) 
    {
      int count = 0;
      for (int i = 0;i<=str.length()-1;i++)
      {
        if (str.charAt(i) == 'e')
          count += 1;
      }
      return ((count == 1) || (count == 3)) ? true : false;  
    }
