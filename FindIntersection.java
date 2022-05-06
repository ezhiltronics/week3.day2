package week3.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] arr1= {1,3,6,8,9};
		int[] arr2= {3,6,67,9,34};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}

}
}
