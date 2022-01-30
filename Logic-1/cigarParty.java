			
								                                                  cigarParty
                                                                  
Problem Statement : 
-------------------
  When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of
  cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number
  of cigars. Return true if the party with the given values is successful, or false otherwise.

Sample testcases :
------------------
  cigarParty(30, false) → false
  cigarParty(50, false) → true
  cigarParty(70, true) → true
  
My Solution :
-------------
  public boolean cigarParty(int cigars, boolean isWeekend) 
  {
    boolean isPartySucessful = false;
    if (isWeekend) {
      if (cigars >= 40)  isPartySucessful = true;
    }
    else {
      if ((cigars >= 40) && (60 >= cigars)) isPartySucessful = true;
    }
    return isPartySucessful;
  }
