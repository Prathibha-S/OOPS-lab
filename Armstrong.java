class Armstrong
{
public static void main(String[] args) 
{
int n = 122, c, r, result = 0;

        c = n;

        while (c != 0)
        {
            r = c % 10;
            result += Math.pow(r, 3);
            c /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}