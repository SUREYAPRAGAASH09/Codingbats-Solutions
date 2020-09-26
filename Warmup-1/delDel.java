Problem Statement :
-------------------
      Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

Test cases :
------------
      delDel("adelbc") → "abc"
      delDel("adelHello") → "aHello"
      delDel("adedbc") → "adedbc"

My Solution :
-------------
        public String delDel(String str) {
              String  modifiedStr = "";
              char[] charArray = str.toCharArray();
                if ( ((str.length()-1) >= 3) && (charArray[1] == 'd') && (charArray[2] == 'e') && (charArray[3] == 'l') )
                {
                    for (int i= 4;i<=str.length()-1;i++)
                    {
                        modifiedStr += charArray[i];
                    }
                    return charArray[0] + modifiedStr;    
                }
                else
                {
                    return str;    
                }

        }
