package challengeTwo;

import java.util.Arrays;

public class challengeTwo {
	
	public static void main(String[] args)
	{
		String[] list = {"quiet", "heart", "loved", "hated", "sport"};
		
		System.out.println(found(list, "hated"));
		printArr(mergeSort(list));
	}
	
	/*@param list1, @param list2 takes in an array of strings*/
	public static String[] merge(String[] list1, String[] list2)
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
	
	public static String[] mergeSort(String[] list)
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
	
	public static void printArr(String[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
		
	public static int found(String[] list, String s)
	{
		int index = -1;
		list=mergeSort(list);
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].equals(s))
			{
				index =  i;
			}
		}
		return index;

	}
}
