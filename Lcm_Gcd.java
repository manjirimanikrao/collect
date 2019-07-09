import java.util.Scanner;

public abstract class Lcm_Gcd implements g_l_interface
{
public static void main(String args[])
{
	
Scanner sc = new Scanner(System.in);
int m1 = sc.nextInt();
int m2= sc.nextInt();


   g_l_interface gl = (p1,p2) ->{
	   int gcd=1;
	int n1=p1;
	int n2=p2;
    for(int i = 1; i <= n1 && i <= n2; ++i)
    {
        if(n1 % i == 0 && n2 % i == 0)
            gcd = i;
    }
    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    System.out.printf("The GCD of %d and %d is %d.", n1, n2, gcd);

	



};

gl.gcd_lcm_function(m1,m2);


	
	
	
	

}}