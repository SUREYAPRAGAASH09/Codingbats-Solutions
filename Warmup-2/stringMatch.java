Problem Statement :
-------------------
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    
Sample Test cases :
-------------------
  stringMatch("xxcaazz", "xxbaaz") → 3
  stringMatch("abc", "abc") → 2
  stringMatch("abc", "axc") → 0
    
My Solution 1 :
---------------
   public int stringMatch(String a, String b) 
   {
      String[] str1SubEle = new String[a.length()];
      String[] str2SubEle = new String[b.length()];
      int SubStrEquCnt = 0;
      
      //build sub string Element
      for (int str1Itr = 0; str1Itr < a.length()-1; str1Itr++)
        str1SubEle[str1Itr] = Character.toString(a.charAt(str1Itr)) + Character.toString(a.charAt(str1Itr + 1));
      
      for (int str2Itr = 0; str2Itr < b.length()-1; str2Itr++)
        str2SubEle[str2Itr] = Character.toString(b.charAt(str2Itr)) + Character.toString(b.charAt(str2Itr + 1));
      
      for (int i = 0; i < (a.length()>b.length()?b.length():a.length()) - 1; i++) 
      {
        if ((str1SubEle[i].equals(str2SubEle[i]))) 
          SubStrEquCnt++;
      }
      return SubStrEquCnt;
  }
  
My reference 2 :[Stackover flow][https://stackoverflow.com/questions/45047932/find-number-of-positions-containing-similar-length][Sol-1]
-------------
  public int stringMatch(String a, String b) 
  {
      int counter = 0;
      for (int itr = 0; itr < (a.length()>b.length()?b.length():a.length()) - 1; itr++) {
        if ((a.substring(itr, itr + 2).equals(b.substring(itr, itr + 2)))) {
          counter++;
        }
      }
      return counter;
  }


