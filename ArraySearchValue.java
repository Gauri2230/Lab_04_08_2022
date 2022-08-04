import java.util.Scanner;
class ArraySearchValue
{
	boolean value =false;
	public static void main(String args[])
	{
		int a;
		boolean status=false;
		int ex[]= new int[5];
		Scanner s = new Scanner(System.in);
		for (int i=0;i<ex.length;i++)
		{
			ex[i]=s.nextInt();
			System.out.println(ex[i] );
		}
		System.out.print("Enter the Search value: ");
		 a= s.nextInt();
		for(int i = 0; i < ex.length; i++)
        		{
            		if(ex[i] == a)
			{
				status =true;
				break;
			}
		
		}		
		if(status)	
		{
			System.out.println(a+" is found");
		}
		else	
		{
			System.out.println(a+" is not found");
		}
	} 
}