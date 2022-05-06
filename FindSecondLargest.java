package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] num= {3,9,6,4,5,8};
			
			Arrays.sort(num);
			int secNum=num.length-2;
			System.out.println("Second largest number is:"+secNum);
		}

}
