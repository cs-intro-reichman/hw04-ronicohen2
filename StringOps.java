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
        System.out.println(capVowelsLowRest(str));
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

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
