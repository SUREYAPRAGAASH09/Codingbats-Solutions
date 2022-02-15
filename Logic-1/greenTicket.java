			
								                                                  greenTicket
                                                                  
Problem Statement : 
-------------------
  You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, 
  the result is 0. If all of the numbers are the same,
  the result is 20. If two of the numbers are the same, the result is 10.
    
Sample testcases :
------------------
  greenTicket(1, 2, 3) → 0
  greenTicket(2, 2, 2) → 20
  greenTicket(1, 1, 2) → 10
  
My Solution :
-------------
  public int greenTicket(int a, int b, int c) {
    int resultNum = 0;
    if ((a == b) && (b == c) && (c == a))
    {
      resultNum = 20;
    }
    else if ((a == b) || (b == c) || (c == a))
    {
      resultNum = 10;
    }
    else if ((a != b) && (b != c) && (c != a))
    {
      resultNum = 0;
    }
    return resultNum;
  }
