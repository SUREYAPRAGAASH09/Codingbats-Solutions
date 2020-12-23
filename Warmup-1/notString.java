Problem Statement :
-------------------
      Given a string, return a new string where "not " has been added to the front. 
      However, if the string already begins with "not", return the string unchanged.
      Note: use .equals() to compare 2 strings.

Test Cases : 
-------------
    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"

My Solutions :
-------------
    Solution 1 :
    ------------
    public String notString(String str) {
          if (str.trim().split("\\s+")[0].equals("not"))
              return str;      
          return "not " + str;
          
    solution 2 :
    ------------
    public String notString(String str) {
          try {
                if ((str.charAt(0) == 'n') && (str.charAt(1) == 'o') && (str.charAt(2) == 't') ) 
                        return str;
                else
                      return "not00" + str;
          }
          catch(Exception e) {
		    return "not " + str;
	     }
    }
	    
    solution 3 :
    -----------	    
      public String notString(String str) 
     {
	  Boolean Flag = false;

	  if  ((str.length() == 2) || (str.length() == 1)) 
	    Flag = true;
	  else if (str.length() >= 3) {
	    char[] charArr = str.toCharArray(); 
	    if ( (charArr[0] == 'n') && (charArr[1] == 'o') && (charArr[2] == 't'))
	      Flag = false;
	    else
	      Flag = true;
	  }

	  if (Flag)
	    return "not " + str;
	  else
	    return str;
    }

