package the_logical_Programs;

public class TrianglePattern 
{
public static void main(String[] args) 
{
for(int i =1; i<=10;i++)
{
	for(int j = 10; j>=1 ;j--)
		if(j>i)
	{
		System.out.print(" ");
	}
		else
		{
	System.out.print(" *");
}
System.out.println(" ");
}
}
}
