package the_logical_Programs;

public class GivenNumberIsPrimeOrNot 
{
public static void main(String[] args) 
{
int num = 9;
int temp = 0;
for(int i=2;i<num-1;i++)
	if(i%2==0)
	{
		temp=1;
	}
if(temp==0)
{
	System.out.println(num+" It is a Prime NUmber");
}
else
{
	System.out.println(num+" It is not a Prime Number");
}
	}
}

