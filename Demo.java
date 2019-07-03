import java.util.*;
  
public class Demo {
	 public static void main(String[] args) {
	      ArrayList<String> lst =  new ArrayList<>();  
	      lst.add("alpha");            // add() takes Object
	      lst.add("beta");
	      lst.add("charlie");
	    for(int i=0;i<lst.size();i++) {
	    	System.out.printf("List #%s==%s\n",i, lst.get(i));
	    }
	    System.out.println("listStrings before sorting: " + lst); //sorting
	    Collections.sort(lst);
	    System.out.println("listStrings after sorting: " + lst);
	    String element= lst.get(1); //retrieving data
	    System.out.printf(element); 
	    lst.set(2,"new"); //updating data
	    for(int i=0;i<lst.size();i++) {
	    	System.out.printf("List #%s==%s\n",i, lst.get(i));
	    }
	    lst.remove(2); //deleting element
	    for(int i=0;i<lst.size();i++) {
	    	System.out.printf("List #%s==%s\n",i, lst.get(i));
	    }
	    if (lst.contains("beta")) {
	        System.out.println("Found the element");
	    } else {
	        System.out.println("There is no such element");
	    }
	    int lastIndex = lst.indexOf("beta");
	    System.out.println(lastIndex);//searching
	 }
}
