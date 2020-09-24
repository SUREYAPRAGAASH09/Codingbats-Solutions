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
