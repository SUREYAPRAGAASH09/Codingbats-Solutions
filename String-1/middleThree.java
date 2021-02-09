Problem Statement :
-------------------
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
          
Test Cases :
------------
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"

My Solution :
------------- 
    public String middleThree(String str) {
      return (str.length() > 3) ? str.substring((str.length()/2)-1, (str.length()/2)+2) : str;
    }
