Problem Statement :
-------------------
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    
Sample Test cases :
-------------------
   stringBits("Hello") → "Hlo"
   stringBits("Hi") → "H"
   stringBits("Heeololeo") → "Hello"
    
My Solution :
-------------
   public String stringBits(String str) {
    int strLen  = str.length();
    String newStr = "";

    if ((strLen <= 2) && (strLen != 0))
    {
      newStr = Character.toString(str.charAt(0));
    }
    else
    {
      for (int itr = 0;itr <= str.length()-1; itr ++)
      {
        newStr = newStr + Character.toString(str.charAt(itr));
        itr+=1;  
      }   
    }
    return newStr;
  }
