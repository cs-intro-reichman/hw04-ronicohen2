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
        boolean[] visited = new boolean[array2.length];
        
        for(int i=0; i<array1.length; i++)
        {
            boolean same = true;
            for (int j=0; j<array2.length; j++)
            {
                if (!visited[j]&&(array1[i]==array2[j]))
                {
                    same = true;
                    visited[j] = true;
                    break;
                }
            }
            if (!same)
            {
            return false;
            }
        }      
        return true;
    }

    public static boolean isSorted(int [] array) 
    {
        boolean sorted = true;
        for (int i = 0 ; i < array.length - 1; i++)
        {
            if (array[i+1] < array[i]) 
            {
                sorted = false;
                break;
            }
        }
        if (sorted == true)
        {
            return sorted;
        }
        else
        {
            for (int j = array.length ; j > 1; j++)
        {
            if (array[j] > array[j-1]) 
            {
                sorted = false;
                break;
            }
        }
        }      
        return sorted;
    }

}
