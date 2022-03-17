class Prime
{
public static void main(String args[])
{
int x=11;
int c=0;
if(x>1)
{
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			c=1;
		}
		else
		{
			continue;
		}
	}
}
if(c==1)
{
	System.out.println(x+" is not a prime number");
}
else
{
	System.out.println(x+" is a prime number");
}
}
}