public class ArrayOps 
{
    public static void main(String[] args) 
    {
        int[] x= {1,2,3,4,5};
        int[] y= {1,2,1,1,2};
        int[] z= {2,1};
        System.out.println(findMissingInt(x));
        System.out.println(secondMaxValue(x));
        System.out.println(containsTheSameElements(z, y));
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
        boolean same = true;
        for(int i=0; i<array1.length; i++)
        {
            for (int j=0; j<array2.length; j++)
            {
                if (array1[i]==array2[j])
                {
                    same = true;
                    break;
                }
                else same = false;
              }
           }
        
        return same;
    }

    public static boolean isSorted(int [] array) 
    {
        boolean isSorted = true;
        for (int i = 0 ; i < array.length - 1; i++)
        {
            if (array[i+1] < array[i]) 
            {
                isSorted = false;
                break;
            }
        }
        for (int j = array.length ; j > 1; j++)
        {
            if (array[j] > array[j-1]) 
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

}
