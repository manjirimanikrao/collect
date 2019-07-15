package pkg;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Multiple {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tasks to be done ");
		int n =sc.nextInt();
		ThreadPoolExecutor executor =(ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		
		for(int i=0;i<n;i++)
		{
			
		ThreadMethod t = new ThreadMethod("Task "+i);
			System.out.println("Created "+t.getname());
			
			executor.execute(t);
			
			
			
		}
	executor.shutdown();
	 while (!executor.isTerminated()) {
     }
     System.out.println("Finished all threads");
 }
	
   
		
		
		
		
	}
	
	
