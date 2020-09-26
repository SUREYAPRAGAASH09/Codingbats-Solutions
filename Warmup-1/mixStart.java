Problem Statement :
-------------------
      Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


Test cases :
------------
      mixStart("mix snacks") → true
      mixStart("pix snacks") → true
      mixStart("piz snacks") → false

My solution :
-------------
      public boolean mixStart(String str) {
        return (((str.length()>=3) && (str.charAt(1) == 'i' ) && (str.charAt(2) == 'x') ) ? (true):(false));
      }
