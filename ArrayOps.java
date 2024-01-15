public class ArrayOps 
{
    public static void main(String[] args) 
    {
        int[] x= {1,2,3,4,5};
        int[] y= {3,-4,1,2,5};
        int[] z= {1,3,-4,5};
        System.out.println(findMissingInt(x));
        System.out.println(secondMaxValue(x));
        System.out.println(containsTheSameElements(y,z));
        System.out.println(isSorted(x));
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
        boolean same1 = false;;
        boolean same2 = false;
        for(int i=0; i<array1.length; i++)
        {
            same1 = false;
            for (int j=0; j<array2.length; j++)
            {
                if ((array1[i]==array2[j]))
                {
                    same1 = true;
                }             
            }
            if (same1==false)
            {
                break;
            }
        }
        for(int i=0; i<array2.length; i++)
        {
            same2 = false;
            for (int j=0; j<array1.length; j++)
            {
                if ((array2[i]==array1[j]))
                {
                    same2 = true;
                }
            }
            if (same2==false)
            {
                break;
            }
        }            
        return (same1 && same2);
    }

    public static boolean isSorted(int [] array) 
    {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0 ; i < array.length - 1; i++)
        {
            if (array[i+1] < array[i]) 
            {
                ascending = false;
            }
            if (array[i+1] > array[i]) 
            {
                descending = false;
            }

        }   
        return (ascending||descending);
    }

}
