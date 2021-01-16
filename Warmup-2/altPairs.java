Problem Statement :
-------------------
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    
Sample Test cases :
-------------------
  altPairs("kitten") → "kien"
  altPairs("Chocolate") → "Chole"
  altPairs("CodingHorror") → "Congrr"
    
My Solution :
-------------
  public String altPairs(String str) {
  String newStr = "";
  int count = 0;
  if (str.length() > 0) {
    for (int itr=0;itr < str.length();itr++) {
      count += 1;
      newStr = newStr + Character.toString(str.charAt(itr));
      if (count == 2) {
        itr += 2;
        count = 0;
      }
    }
  }
  return newStr;
}
