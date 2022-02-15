			
								                                                shareDigit
                                                                  
Problem Statement : 
-------------------
  Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
    (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
    
Sample testcases :
------------------
  shareDigit(12, 23) → true
  shareDigit(12, 43) → false
  shareDigit(12, 44) → false
  
My Solution :
-------------
  public boolean shareDigit(int a, int b) {
    int bDgt = b / 10;
    int aDgt = a % 10;

    int bDgt2 = a / 10;
    int aDgt2 = b % 10;

    int bDgt3 = a % 10;
    int aDgt3 = b % 10;

    int bDgt4 = a / 10;
    int aDgt4 = b / 10;
    if ((bDgt == aDgt) || (bDgt2 == aDgt2) || (bDgt3 == aDgt3) || (bDgt4 == aDgt4))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
