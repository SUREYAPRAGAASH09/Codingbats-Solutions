Problem Statement :
-------------------
      Given a string, return true if the string starts with "hi" and false otherwise.

Test cases :
------------
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false

My solution :
-------------
public boolean startHi(String str) {
      String[] splitStr = str.toUpperCase().trim().split("\\s+");
	    String MatchString = "HI";
	    boolean ind = false;
      if (MatchString.equals(splitStr[0]))
      {
          ind = true;
      }
		  return ind;
}

My Solution 2 :
---------------
public boolean startHi(String str) {
      if ( (str.length() -1 >= 1) &&  (str.charAt(0) == 'h') && (str.charAt(1) == 'i') )
            return true;
      else
            return false;
}
