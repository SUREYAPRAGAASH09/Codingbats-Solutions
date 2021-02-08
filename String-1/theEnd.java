Problem Statement :
-------------------
    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
          
Test Cases :
------------
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
    
My Solution :
-------------   
   public String theEnd(String str, boolean front) {
    return (front) ? Character.toString(str.charAt(0)) : Character.toString(str.charAt(str.length()-1));
  }
