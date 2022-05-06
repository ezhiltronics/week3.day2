package week3.day2;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,6,1,2,5,8};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(i+1!=a[i])
			{
				System.out.println("Missing element:"+(i+1));
				break;
			}
		}
	}

}
