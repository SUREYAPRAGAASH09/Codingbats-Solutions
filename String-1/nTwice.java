Problem Statement :
-------------------
    Given a string and an int n, return a string made of the first and last n chars from the string. 
    The string length will be at least n.
          
Test Cases :
------------
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"

My Solution :
------------- 
  public String nTwice(String str, int n) {
    return str.substring(0, n) + str.substring(str.length()-n, str.length()); 
  }

My Solution 2 : 
---------------
    public String nTwice(String str, int n) 
    {
      String newstr = "";
      for (int i=0;i<n;i++)
      {
        newstr += str.charAt(i);
      }
      for (int i=n;i>0;i--)
      {
        newstr += str.charAt(str.length() - i);
      }
      return newstr;
    }

