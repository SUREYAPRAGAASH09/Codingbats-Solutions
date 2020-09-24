Problem Statement :
-------------------
          Given a string, take the last char and return a new string with the last char added at the front and back, 
          so "cat" yields "tcatt". The original string will be length 1 or more.
          
Test Cases :
------------
          backAround("cat") → "tcatt"
          backAround("Hello") → "oHelloo"
          backAround("a") → "aaa"

My Solution :
-------------
          public String backAround(String str) {
            if (str.length() >= 2) {
                  return str.substring(str.length() - 1, str.length()) + str + str.substring(str.length() - 1, str.length());
            }	    
            else {
                  return str + str + str;
            }
          }
My solution 2 :
---------------
          public String backAround(String str) {
                    char lastChar = str.charAt(str.length() - 1); 
                    if (str.length() >= 2) 
		    return lastChar + str + lastChar;
	          else 
		    return str + str + str;
	
          }
