package challengeFour;
import challengeOne.challengeOne;;
public class challengeFour {

	 public static void main(String[]args)
	 {
		 int[][] list= {{1,3,5},{6,8,3},{100,50,20}};
		
		
		 System.out.print(sortarr(list));
	 }
	 public static int sortarr(int[][]arr)
	 {
		 int median = 0;
		 int[] list = new int[arr.length];
		 for(int i = 0;i<arr.length;i++)
		 {
			
			list[i] = challengeOne.median(arr[i]);
			//Hello
			 
		 }
		median = challengeOne.median(list);
		return median;
	 }
	 public static void printarr(int[]arr)
	 {
		 for(int i = 0;i<arr.length;i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
	 }
}
