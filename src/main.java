import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };
		int[] b1 = getEvenArrayFrom(a);
		int[] b2 = getOddArrayFrom(a);
		
		System.out.println(java.util.Arrays.toString(a));
		System.out.println(java.util.Arrays.toString(b1));
		System.out.println(java.util.Arrays.toString(b2));
	}
	
	
	public static int[] getOddArrayFrom(int[] a)
	{
		int[] b2 = new int[a.length];
		int lengthb = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 != 0)
			{
				b2[lengthb++] = a[i];
			}
		}
		return Arrays.copyOfRange(b2, 0, lengthb);
	}

	
	public static int[] getEvenArrayFrom(int[] a)
	{
		int[] b1 = new int[a.length];
		int lengthb = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				b1[lengthb++] = a[i];
			}
		}
		return Arrays.copyOfRange(b1, 0, lengthb);
	}

}
