Problem Statement :
-------------------
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    
Sample Test cases :
-------------------
    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
    
My Solution :
-------------
    public String stringTimes(String str, int n) {
      String newStr = "";
      for (int itr = 1;itr <= n; itr ++)
        newStr = newStr + str;
      return newStr;
    }
