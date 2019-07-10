import java.util.Scanner;

public class Lcm_Gcd 
{
	interface Gcd{
		int CalGcd(int m1,int m2);
	}
	interface Lcm{
		int CalLcm(int m1,int m2);
	}
	
	
public static void main(String args[])
{

	Gcd d=(n1,n2)->{while(n1!=n2) {if(n1>n2) n1-=n2;
	else
		n2-=n1;
	}
	return n1;
	};
	Lcm l=(n1,n2)->n1*n2/d.CalGcd(n1, n2);
Scanner sc =new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println("Gcd is"+d.CalGcd(n1, n2) );
System.out.println("Lcm is"+l.CalLcm(n1, n2));
}

}