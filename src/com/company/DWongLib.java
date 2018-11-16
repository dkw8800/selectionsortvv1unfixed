package com.company;

public class DWongLib {

    public int last = 0;
    public int max = 0;
    public int min = 0;
    public int maxspot = 0;
    public int minspot = 0;

    public void selection(int[] array, String direction)
    {

        for(int k = 0; k < array.length; k++)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                max = Math.max(array[i], array[i+1]);
            }
            System.out.println(max);
            maxspot = findIndex(array, max);
            System.out.println(maxspot);
        }

        for(int k = 0; k < array.length; k++)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                min = Math.min(array[i], array[i+1]);
            }
            System.out.println(min);
            minspot = findIndex(array, min);
            System.out.println(minspot);
        }

        if(direction.equals("asc"))
        {
            for(int k = 0; k < array.length; k++)
            {
                for(int i = 0; i < array.length - 1; i++)
                {
                    if(array[i] > array[i+1])
                    {
                        last = array[array.length - 1];
                        array[array.length - 1] = max;
                        array[maxspot] = last;
                    }
                }
            }
        }
        else if(direction.equals("desc"))
        {
            for(int k = 0; k < array.length; k++)
            {
                for(int i = 0; i < array.length - 1; i++)
                {
                    if(array[i] > array[i+1])
                    {
                        last = array[array.length - 1];
                        array[array.length - 1] = min;
                        array[minspot] = last;
                    }
                }
            }
        }
        else
        {
            System.out.println("Your direction is not valid. I do not understand whether to go into ascending or descending order.");
        }

    }


        public static int findIndex(int arr[], int t)
        {
            if (arr == null) {
                return -1;
            }

            int i = 0;

            while (i < arr.length)
            {
                if (arr[i] == t) {
                    return i;
                }
                else {
                    i = i + 1;
                }
            }
            return -1;
        }

        public printmax(array)
        {
            for(int k = 0; k < array.length; k++)
            {
                for(int i = 0; i < array.length - 1; i++)
                {
                    max = Math.max(array[i], array[i+1]);
                }
                System.out.println(max);
                maxspot = findIndex(array, max);
                System.out.println(maxspot);
            }

        }
    }


