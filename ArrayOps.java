public class ArrayOps 
{
    public static void main(String[] args) 
    {
        int[] x= {1,2,3,4,5};
        System.out.println(findMissingInt(x));
        System.out.println(secondMaxValue(x));
    }
    
    public static int findMissingInt (int [] array) 
    {
        int missing=0; 
        int max= array[0];
        for(int j=1; j<array.length; j++)
        {
            if (max < array[j])
            {
                max = array[j];
            }
        }
        if (max==0)
        {
            missing = 1;
        }
        for(int i=1; i< array.length; i++)
        {
            boolean found = false;
            for(int j=0; j< array.length; j++)
            {
                if (array[j]==i)
                {
                     found = true;
                }
            }
            if (!found)
            {
                missing = i;
            }       
        }

        return missing;
    }

    public static int secondMaxValue(int [] array) 
    {
        int max= 0;
        int secondmax = 0;
        int indxmax = 0;
        for(int j=1; j<array.length; j++)
        {
            if (array[j] >= max)
            {
                secondmax = max;
                max = array[j];
            }
            else if ((secondmax < array[j])&&(array[j]<max))
            {
                secondmax = array[j];
            }
        }
        return secondmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) 
    {
        // Write your code here:
        return false;
    }

}
