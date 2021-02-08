Problem Statement :
-------------------
    Given a string, return true if it ends in "ly".
          
Test Cases :
------------
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false

My Solution :
------------- 
   public boolean endsLy(String str) {
      boolean result = false;
      if (str.length() >= 2)
      {
        String newStr = str.substring(str.length()-2, str.length());
        if ( (newStr.charAt(0) == 'l') && (newStr.charAt(1) == 'y')  )
          result = true;
      }
      return result;
    }
  
