Problem Statement :
-------------------
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    
Sample Test cases :
-------------------
  countXX("abcxx") → 1
  countXX("xxx") → 2
  countXX("xxxx") → 3
    
My Solution :
-------------
  int countXX(String str)
  {
    int count = 0;
    for (int itr = 0;itr < str.length(); itr ++)
    {
      if (str.charAt(itr) == 'x')
        count ++;
      else if (str.charAt(itr) == ' ')
        count --;
    }  
    return (count > 0) ? count-1 : 0;
 }
