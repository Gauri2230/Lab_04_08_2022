import java.util.Scanner;
class Arraydescending
{
	public static void main(String args[])
	{
		int temp=0;
		int ex[]= new int[5];
		Scanner s = new Scanner(System.in);
		for (int i=0;i<ex.length;i++)
		{
			ex[i]=s.nextInt();
		}
		for (int i = 0; i < ex.length; i++) 
		{     
		            for (int j = i+1; j < ex.length; j++) 
			{     
			               if(ex[i] <ex[j]) 
				{    
                 		           		temp = ex[i];    
                   				ex[i] = ex[j];    
                   				ex[j] = temp; 
				}
			}
			System.out.println(ex[i] );   
		}
			
	} 
}