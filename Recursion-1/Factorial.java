                                                                      Factorial

Problem Statement :
-------------------
           Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


Test cases : 
------------
       factorial(1) → 1 
       factorial(2) → 2
       factorial(3) → 6

Solution :
----------
      public int fact(int n)
      {
        if (1>=n)
        {
          return 1;
        }
        else
        {
          return n*fact(n-1);
        }
      }

      public int factorial(int n) {
        int result = fact(n);
        return result;
      }
