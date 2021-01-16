Problem Statement :
-------------------
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
    
Sample Test cases :
-------------------
  stringX("xxHxix") → "xHix"
  stringX("abxxxcd") → "abcd"
  stringX("xabxxxcdx") → "xabcdx"
    
My Solution :
-------------
  public String stringX(String str) 
  {
    String newStr = "";
    Boolean StrHasChanged = false;

    if (str.length() > 1)
    {
      for (int itr = 1; itr < str.length()-1; itr ++)
      {
        if (str.charAt(itr) != 'x')
        {
          StrHasChanged = true;
          newStr = newStr + Character.toString(str.charAt(itr));
        }
      }
    }

    return ((str.length() == 1) || (!(StrHasChanged))) ? str : Character.toString(str.charAt(0)) + newStr + Character.toString( str.charAt(str.length()-1) );
  }
