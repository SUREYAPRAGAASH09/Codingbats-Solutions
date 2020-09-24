Problem Statement :
------------------
      Given a string, return a string made of the first 2 chars (if present),
      however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

Test Cases :
------------
    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
    
My Solution 1 :
----------------
public String startOz(String str) {
  String returnString = ""; 
  char[] charArray = str.toCharArray();
  if (str.length() >=2)
  {
    
    if ( (charArray[0] == 'o') && (charArray[1] == 'z'))
    {
      returnString = "oz";
    }
    else if (charArray[0] == 'o')
    {
      returnString = "o";
    }
    else if (charArray[1] == 'z')
    {
      returnString = "z";
    }
  }
  else if (str.length() >=1)
  {
    if (charArray[0] == 'o')
    {
      returnString = "o";
    }
  }
  return returnString;
}

My Solution 2 : [Logic changed]
---------------
public String startOz(String str) {
  String returnString = ""; 
  char[] charArray = str.toCharArray();
  if (str.length() > 0)
  {
      if (str.length() >= 2 && (charArray[0] == 'o') && (charArray[1] == 'z'))
         returnString = "oz";
      else 
      {
        if ((charArray[0] == 'o'))
          returnString = "o";
        else if (charArray[1] == 'z')
          returnString = "z";
      }  
  }
  
  return returnString;
}

My Solution 3 : [Code optimized too much]
---------------
public String startOz(String str) {
  int StrLength = str.length(); 
  if (StrLength > 0)
  {
      if (StrLength >= 2 && (str.charAt(0) == 'o') && (str.charAt(1) == 'z'))
         return "oz";
      else 
      {
        if ((str.charAt(0) == 'o'))
          return  "o";
        else if (str.charAt(1) == 'z')
          return "z";
      }  
  }
  return "";
}


