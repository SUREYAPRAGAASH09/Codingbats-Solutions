Problem Statement :
-------------------
    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. 
    The "yak" strings will not overlap.
    
Sample Test cases :
-------------------
  stringYak("yakpak") → "pak"
  stringYak("pakyak") → "pak"
  stringYak("yak123ya") → "123ya"
    
My Solution :
-------------
  public String stringYak(String str) {
    Boolean cond = true;

    while (cond) {
      if (str.contains("yak")) {
        if (str.indexOf("yak") == 0)
            str = str.substring(str.indexOf("yak")+3, str.length());
        else if (str.lastIndexOf("yak")+3 == str.length() )
            str = str.substring(0, str.lastIndexOf("yak"));
        else
          str = str.substring(0, str.indexOf("yak")) + str.substring(str.indexOf("yak")+3 , str.length());
      }
      else
        cond = false;
    }

    return str;
  }
