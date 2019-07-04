
 import java.util.Scanner;

 public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many strings u want to check?");
		int t=sc.nextInt();
		while(t-->0){
			System.out.println("Enter the string!");
			String s=sc.next();
			int digits=0;
			for(int i=0;i<s.length();i++){
				if(Character.isDigit(s.charAt(i))){
					digits++;
				}
			}
			System.out.println(digits);
		}
		System.out.println();
	}

}