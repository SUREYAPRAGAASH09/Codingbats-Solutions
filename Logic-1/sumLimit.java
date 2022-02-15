			
								                                                  sumLimit
                                                                  
Problem Statement : 
-------------------
  Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
  If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a 
  non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
    
Sample testcases :
------------------
  sumLimit(2, 3) → 5
  sumLimit(8, 3) → 8
  sumLimit(8, 1) → 9
  
My Solution :
-------------
  public int sumLimit(int a, int b) 
  {
    String alen = (Integer.toString(a));
    String sumlen = (Integer.toString(a+b));
    int alend = alen.length(), aaa  = sumlen.length();
    int resultNum = a + b;
    if (aaa > alend)
    {
      resultNum = a;
    }
    return resultNum;
  }

  public int GetNoOfDigits(int num)
  {
    int  tempNum=num,temp,cnt = 0;
    while (tempNum>0)
    {
        temp = tempNum % 10;
        if (temp > 0)
        {
            tempNum = tempNum / 10;
            cnt += 1;
        }
        else
        {
            break;
        }
    }
    return cnt;
  }
