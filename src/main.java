
public class main {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, -1, -2, -3, -4 };
		int[] a1;
		int[] a2 = new int[a.length / 2];
		if (a.length % 2 != 0) 
		{
			a1 = new int[a.length / 2 + 1];
		} else 
		{
			a1 = new int[a.length / 2];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i % 2 == 0)
			{
				a1[i/2]=a[i];
			}
			else
			{
				a2[i/2]=a[i];
			}
		}
		
		System.out.println(java.util.Arrays.toString(a));
		System.out.println(java.util.Arrays.toString(a1));
		System.out.println(java.util.Arrays.toString(a2));

	}

}
