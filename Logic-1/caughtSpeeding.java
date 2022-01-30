			
								                                                        caughtSpeeding
                                                                  
Problem Statement : 
-------------------
  You are driving a little too fast, and a police officer stops you. Write code to compute the result,
  encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
  If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
  Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    
Sample testcases :
------------------
  caughtSpeeding(60, false) → 0
  caughtSpeeding(65, false) → 1
  caughtSpeeding(65, true) → 0
  
My Solution :
-------------
  public int caughtSpeeding(int speed, boolean isBirthday) 
  {
    int lowerLmt = 60, UpperLmt = 80, ticket = 0;

    if (isBirthday)
    {
      lowerLmt += 5;
      UpperLmt += 5;
    }

    if (lowerLmt >= speed)
      ticket = 0;

    if ((speed >= (lowerLmt + 1))  &&  (UpperLmt >= speed))
      ticket = 1;

    if (speed >= (UpperLmt+1))
      ticket = 2;

    return ticket;
  }
