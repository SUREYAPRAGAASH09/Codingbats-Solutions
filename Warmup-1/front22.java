Problem Statement :
--------------------
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the 
    front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

Test Cases:
-----------
    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"
    
My solution :
------------
   public String front22(String str) {
      if (str.length() >= 2) {
      String FirstTwoChar = Character.toString(str.charAt(0)) + Character.toString(str.charAt(1));
      return  FirstTwoChar + str + FirstTwoChar;
      } else 
	  return str + str + str;
   }
