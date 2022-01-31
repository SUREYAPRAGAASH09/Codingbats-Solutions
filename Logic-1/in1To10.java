			
								                                                in1To10
                                                                  
Problem Statement : 
-------------------
  Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case 
  return true if the number is less or equal to 1, or greater or equal to 10.


    
Sample testcases :
------------------
  in1To10(5, false) → true
  in1To10(11, false) → false
  in1To10(11, true) → true
  
My Solution :
-------------
  public boolean in1To10(int n, boolean outsideMode) 
  {
     boolean flag = false;

     if (!(outsideMode))
     {
       if ((n >= 1) && (10 >= n)) flag = true;
     }
     else
     {
       if ((n <= 1) || (n >= 10)) flag = true;
     }
     return flag;
  }
