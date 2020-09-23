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
      
