package challengeOne;

import java.util.Arrays;

public class challengeOne {
	
	public static void main(String[] args)
	{
		int[] list1 = {1,5,3,2,7,9,3};
		int[] list2 = {7,7,1,3,2,8};
		
		//printArr(mergeSort(merge(list1,list2)));
		printArr(mergeSort(list1));
		System.out.print(median(list1));
	
	}
	
	public static int[] merge(int[] list1, int[] list2)
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
	
	public static int[] mergeSort(int[] list)
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
	
	public static void printArr(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int median(int[] list)
	{
		int median = 0;
		list = mergeSort(list);
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
}
