package BubbleSort;

public class BubbleSortDemo
{
	public static void main(String args[])
	{
		int a[]={7,6,78,9,2};
		
		System.out.println("After Sorting");
		
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
		
		bubbleSort(a);
		
		System.out.println();
		
		System.out.println("Before Sorting");
		
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
	}

	private static void bubbleSort(int[] a) {
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<(a.length)-i;j++)
			{
				if(a[j-1] > a[j])// "<" for decending sorting and ">" for ascending sorting
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}