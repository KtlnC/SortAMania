package SortCompetition;

import java.util.Arrays;

/**Created by Lamia Islam and Kaitlyn Cao 
 * SortAMania Competition
 * */
public class Team12_SortCompetition extends SortCompetition {

	
	/*@param list1 takes in an array of integers
	 * @param list2 takes in an array of integers
	 * 
	 * */
	public int[] merge(int[] list1, int[] list2)
	{	
		int[] result  = new int[list1.length + list2.length];
		int index = 0;
		int i = 0, j = 0;
		
		while(i < list1.length && j < list2.length)
		{
				if(list1[i] <= (list2[j]))
				{
					result[index] = list1[i];
					i++;
					index++;
				}
				else if(list1[i] > (list2[j]))
				{
					result[index] = list2[j];
					j++;
					index++;
					
				}
				if(list1[list1.length-1] <= (list2[list2.length-1]))
				{
					result[result.length-1] = list2[list2.length-1];
				}
				else if(list2[list2.length-1]<=(list1[list1.length-1]))
				{
					result[result.length-1] = list1[list1.length-1];
				}
				
		}
		if(i<list1.length)
		{
			while(i<list1.length)
			{
				result[index] = list1[i];
				index++;
				i++;
			}
			
			
		}
		if(j<list2.length)
		{
			while(j<list2.length)
			{
				result[index] = list2[j];
				index++;
				j++;
			}
		
		}
			
		return result; 
	}
	
	/*@param list takes in an array of integers
	 * 
	 * */
	public int[] mergeSort(int[] list)
	{
		
		int middle = list.length/2;
		
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			int[] left = Arrays.copyOfRange(list,0,middle);
			int[] right = Arrays.copyOfRange(list,middle,list.length);
	
			return merge(mergeSort(left),mergeSort(right));
		}
	}
	

	
	/*@param arr takes in an array of integers
	 * prints out each item in the array
	 * */
	public void printArr(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	/*@param list takes in an array of integers
	 * sorts the list and returns the median
	 * */
	public int challengeOne(int[] list)
	{
		int median = 0;
		list = quickSort(list,0,list.length-1);
		if(list.length%2 != 0)
		{
			median =  list[list.length/2];
		}
		else 
		{
			median = (list[list.length/2] + list[(list.length/2) - 1])/2;
		}
		return median;
	}
	
	/*@param list1, @param list2 takes in an array of strings*/
	public  String[] merge(String[] list1, String[] list2)
	{	
		String[] result  = new String[list1.length + list2.length];
		int index = 0;
		int i = 0, j = 0;
		
		while(i < list1.length && j < list2.length)
		{
				if(list1[i].compareTo(list2[j])<=0)
				{
					result[index] = list1[i];
					i++;
					index++;
				}
				else if(list1[i].compareTo(list2[j]) > 0)
				{
					result[index] = list2[j];
					j++;
					index++;
					
				}
				if(list1[list1.length-1].compareTo(list2[list2.length-1])<=0)
				{
					result[result.length-1] = list2[list2.length-1];
				}
				else if(list2[list2.length-1].compareTo(list1[list1.length-1])<=0)
				{
					result[result.length-1] = list1[list1.length-1];
				}
				
		}
		if(i<list1.length)
		{
			while(i<list1.length)
			{
				result[index] = list1[i];
				index++;
				i++;
			}
			
			
		}
		if(j<list2.length)
		{
			while(j<list2.length)
			{
				result[index] = list2[j];
				index++;
				j++;
			}
		
		}
			
		return result; 
	}
	
	/*@param list takes in an array of strings 
	 * */
	public String[] mergeSort(String[] list)
	{
		
		int middle = list.length/2;
		
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			String[] left = Arrays.copyOfRange(list,0,middle);
			String[] right = Arrays.copyOfRange(list,middle,list.length);
			
			return merge(mergeSort(left),mergeSort(right));
		}
	}
	
	/*@param arr takes in an array of strings
	 * iterates through the array and prints each item
	 * */
	public  void printArr(String[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
		
	public int challengeTwo(String[] list, String s)
	{
		int index = -1;
		list=quickSort(list,0,list.length-1);
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].equals(s))
			{
				index =  i;
			}
		}
		return index;

	}
	
	public int challengeThree(int[] list)
	{
		int median = 0;
		quickSort(list,0,list.length-1);
		if(list.length%2 != 0)
		{
			median =  list[list.length/2];
		}
		else 
		{
			median = (list[list.length/2] + list[(list.length/2) - 1])/2;
		}
		return median;
	}
	
	 /*@param arr multidimensional array of integers
	  * */
	 public int challengeFour(int[][]arr)
	 {
		 int median = 0;
		 int[] list = new int[arr.length];
		 for(int i = 0;i<arr.length;i++)
		 {
			
			list[i] = challengeOne(arr[i]);
			//Hello
			 
		 }
		median = challengeOne(list);
		return median;
	 }
	 public int challengeFive(Comparable[] list, Comparable s)
		{
			int index = -1;
			list=quickSort(list,0,list.length-1);
			for(int i = 0; i < list.length; i++)
			{
				if(list[i].equals(s))
				{
					index =  i;
				}
			}
			return index;

		}
	
		/*@param list1, @param list2 takes in an array of strings*/
		public  Comparable[] merge(Comparable[] list1, Comparable[] list2)
		{	
			Comparable[] result  = new Comparable[list1.length + list2.length];
			int index = 0;
			int i = 0, j = 0;
			
			while(i < list1.length && j < list2.length)
			{
					if(list1[i].compareTo(list2[j])<=0)
					{
						result[index] = list1[i];
						i++;
						index++;
					}
					
					else if(list1[i].compareTo(list2[j]) > 0)
					{
						result[index] = list2[j];
						j++;
						index++;					
					}
					
					if(list1[list1.length-1].compareTo(list2[list2.length-1])<=0)
					{
						result[result.length-1] = list2[list2.length-1];
					}
					
					else if(list2[list2.length-1].compareTo(list1[list1.length-1])<=0)
					{
						result[result.length-1] = list1[list1.length-1];
					}
					
			}
			if(i<list1.length)
			{
				while(i<list1.length)
				{
					result[index] = list1[i];
					index++;
					i++;
				}
				
				
			}
			if(j<list2.length)
			{
				while(j<list2.length)
				{
					result[index] = list2[j];
					index++;
					j++;
				}
			
			}
				
			return result; 
		}
	public Comparable[] mergeSort(Comparable[] list)
	{
		
		int middle = list.length/2;
		
		if(list.length <= 1)
		{
			return list;
		}
		else
		{
			Comparable[] left = Arrays.copyOfRange(list,0,middle);
			Comparable[] right = Arrays.copyOfRange(list,middle,list.length);
			
			return merge(mergeSort(left),mergeSort(right));
		}
	}
	
	public String[] quickSort(String arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
        
    }
	public int partition(String arr[], int low, int high)
    {
        String pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot)<=0)
            {
                i++;
 
                // swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	
	public int[] quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
        
    }
	public int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
	public Comparable[] quickSort(Comparable arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
        
    }
	public int partition(Comparable arr[], int low, int high)
	    {
	        Comparable pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j].compareTo(pivot)<=0)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                Comparable temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        Comparable temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
	public static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	public String greeting()
	 {
		 return "Hey ;) it's team 12 ";
	 }
}
