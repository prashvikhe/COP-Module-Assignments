package day1_1;

import java.util.Scanner;

public class arryconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], b[], c[], d;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		b = new int[5];
		System.out.println(" Enter the 1st arry Element ");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		System.out.println(" Enter the 2nd arry Element ");
		for (int j = 0; j < b.length; j++)
			b[j] = sc.nextInt();
		c = new int[a.length + b.length];
/*
		c = new int[a.length + b.length];
		for (int k = 0; k < a.length; k++)
			c[k] = a[k];
		int l = 0;
		for (int k = a.length; k < (a.length + b.length); k++) {
			c[k] = b[l];
			++l;
		}
*/
		int l=0;
		for(int i=0;i<a.length;i++) {
			c[l]=a[i];
			l++;
		}
		for(int i=0;i<b.length;i++) {
			c[l]=b[i];
			l++;
		}
			
		for (int i : c)
			System.out.print(" " + i);
	}
}
