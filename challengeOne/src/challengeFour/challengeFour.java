package challengeFour;
import challengeOne.challengeOne;;
public class challengeFour {

	 public static void main(String[]args)
	 {
		 int[][] list= {{1,3,5},{6,8,3}};
		
		 printarr(sortarr(list));
	 }
	 public static int[] sortarr(int[][]arr)
	 {
		 int[] list = new int[arr.length];
		 for(int i = 0;i<arr.length;i++)
		 {
			
			list[i] = challengeOne.median(arr[i]);
			 
		 }
		 return list;
	 }
	 public static void printarr(int[]arr)
	 {
		 for(int i = 0;i<arr.length;i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
	 }
}
