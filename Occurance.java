import java.util.*;
public class Occurance { 
    static final int MAX_CHAR = 256; 
  
    static void getOccuringChar(String str) 
    { 
        int count[] = new int[MAX_CHAR]; 
  
        int len = str.length(); 
  
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine(); 
        getOccuringChar(s); 
    } 
} 