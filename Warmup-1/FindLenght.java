Problem Statement :
-------------------
    To Find lenght of a given string without using inbuilt method.
    
Solution :
----------
private int stringLength(string str) 
{
  int length = 0;
  bool done = false;
  do 
  {
    try 
    {
        char c = str[length];
        length++;
     } 
     catch (IndexOutOfRangeException) 
     {
        done = true;
     }
   } while(!done);
   return length;
}
