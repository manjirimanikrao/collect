import java.util.*;  
public class TestJavaCollection3{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println("listStrings before sorting: " + v); //sorting
Collections.sort(v);
System.out.println("listStrings after sorting: " + v);
String element= v.get(1); //retrieving data
System.out.printf(element); 
v.set(2,"new"); //updating data
for(int i=0;i<v.size();i++) {
	System.out.printf("List #%s==%s\n",i, v.get(i));
}
v.remove(2); //deleting element
for(int i=0;i<v.size();i++) {
	System.out.printf("List #%s==%s\n",i, v.get(i));
}
if (v.contains("Amit")) {
    System.out.println("Found the element");
} else {
    System.out.println("There is no such element");
}
int lastIndex = v.indexOf("Amit");
System.out.println(lastIndex);//searching
}  
}  