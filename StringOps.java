public class StringOps 
{
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        String str = args[0];
        System.out.println(camelCase(str));
    }

    public static String capVowelsLowRest (String string) 
    {
        String result= "";
        for (int i=0; i<string.length(); i++)
        {
         char c = string.charAt(i);
         if ((c=='a')|| (c=='e')|| (c=='i')||(c=='o')|| (c=='u'))
         {
            result +=(char)(c - 32);
         }
         else if ((c=='A')|| (c=='E')|| (c=='I')||(c=='O')|| (c=='U'))
         {
            result += c;
         }
         else if ((c >= 'A') && (c <= 'Z'))
         {
            result += (char)(c + 32);
         }
         else
         {
            result += c;

         }
        }
        return result;
    }

    public static String camelCase (String string) 
    {
        String result = "";
        String nospaceatbegin ="";
        boolean leadingSpaceFound = false;
        for(int j=0; j<string.length(); j++)
        {
            char c = string.charAt(j);
            if ((c == ' ')&&!leadingSpaceFound)
            {
            } 
            else 
            {
                nospaceatbegin +=c;
                leadingSpaceFound = true;
                
            }
        }
        string = nospaceatbegin;
        char c1 = string.charAt(0);
        for(int i=0; i<string.length(); i++)
        {
            char c2 = string.charAt(i);
            if (c1 == ' ')
            {
                if ((c2 >= 'a') && (c2 <= 'z'))
                {
                    result += (char)(c2 - 32);
                }
                else if ((c2 >= 'a') && (c2 <= 'z'))
                {
                result += c2;
                }
            }
            else if (c2 == ' ')
            {
            }
            else if ((c2 >= 'A') && (c2 <= 'Z'))
            {
                result += (char)(c2 + 32);
            }
            else if ((c2 >= 'a') && (c2 <= 'z'))
            {
                result += c2;

            }
            c1 = string.charAt(i);
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
        int count=0;
        for (int j=0; j<string.length(); j++)
        {
            if(string.charAt(j)== chr)
            {
                count++;
            }
        }
        int[] result = new int [count];
        int index=0;
        for (int i=0; i<string.length(); i++)
        {
            if (string.charAt(i)== chr)
            {
                result[index]= i;
                index++;
            }
        }
        return result;
    }
}
