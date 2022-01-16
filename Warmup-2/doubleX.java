Problem Statement :
-------------------
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    
Sample Test cases :
-------------------
    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
    
My Solution :
-------------
    boolean doubleX(String str) 
    {
      boolean ResultFlag = false;
      int countX = 0, temp1 = 0, temp2 = 0;
      for (int itr = str.length()-1; itr >= 0 ; itr --)
      {
          if (str.charAt(itr) == 'x')
          {
              countX += 1;
              if (countX >= 2)
              {
                  temp2 = itr;
                  ResultFlag = (((temp1 - 1) - temp2) == 0 ) ? true : false;
                  temp1 = temp2;
                  countX -= 1;  
              }
              else if (countX == 1)
              {
                  temp1 = itr;
                  countX += 1;
              }
          }
      }
      return ResultFlag;
  }

My second Solution : 
--------------------
        boolean doubleX(String str) 
        {
          boolean flag = false;
          int temp;
          //char C1 = '',C2 = ''; 
          for (int i=0; i<str.length()-1; i++)
          {
            temp = i+1;
            if ((str.charAt(i) == 'x'))
            {
              if (str.charAt(i) == str.charAt(temp)) flag = true;
              break;
            }
          }
          return flag;
        }

