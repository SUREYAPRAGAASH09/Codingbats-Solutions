PROBLEM STATEMENT :
--------------------
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.

SAMPLE TEST CASES :
-------------------
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8

MY SOLUTION :
-------------
    public int sumDouble(int a, int b) {
      if (a == b)
      {
        return ((a + b) + (a + b));
      }
      else
      {
        return a + b;
      }
    }

MY SOLUTION 2 :
-------------
    public int sumDouble(int a, int b) {
      return (a == b) ? 2* (a+b) : (a+b);
    }


My Solution 3 :
---------------
  public int sumDouble(int a, int b) {
      boolean AbsotuleSubtractionFlag = false;

      if ((a-b) == 0)
        AbsotuleSubtractionFlag = true;

      return (AbsotuleSubtractionFlag) ? 2* (a+b) : (a+b);
}
