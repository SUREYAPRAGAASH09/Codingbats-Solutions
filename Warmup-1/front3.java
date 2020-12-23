Problem Statement :
-------------------
        Given a string, we'll say that the front is the first 3 chars of the string. 
        If the string length is less than 3, the front is whatever is there. 
        Return a new string which is 3 copies of the front.
Test Cases :
-------------
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

My Solution :
--------------
    public String front3(String str) {
      if (str.length () >= 3)
                str = str.substring(0, 3);

      return str + str + str;
    }

My solution 2 :
--------------
  public String front3(String str) {
          String newString = "";
          if (str.length () >= 3){
            for (int i=0;i<=2;i++)
              newString += str.charAt(i);
          }
          else
            newString = str;
          return newString + newString + newString;
  }

My Solution 3:
--------------
        public String front3(String str) 
        {
                  String temp = "";

                  if (str.length() >= 3)
                    temp = Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + Character.toString(str.charAt(2)); 
                  else
                    temp = str;

                  return temp + temp + temp;
        }

My Solution 4:
--------------
        public String front3(String str) {
          String temp = (str.length() >= 3) ? Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + Character.toString(str.charAt(2)) : str;
          return temp + temp + temp;
        }


