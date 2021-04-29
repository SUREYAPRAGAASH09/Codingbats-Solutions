Problem Statement :
-------------------
         We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
          
Test Cases :
------------
          bunnyEars(0) → 0
          bunnyEars(1) → 2
          bunnyEars(2) → 4

My Solution :
-------------
public int calNoOfEars(int bunnies)
{
  if (bunnies <= 0)
  {
    return 0;
  }
  else
  {
    return 2 + calNoOfEars(bunnies-1);
  }
}

public int bunnyEars(int bunnies) 
{
    int result = calNoOfEars(bunnies);
    return result;  
}

