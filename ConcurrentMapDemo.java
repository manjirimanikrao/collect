import java.util.concurrent.*; 
class ConcurrentMapDemo { 
    public static void main(String[] args) 
    { 
        ConcurrentHashMap m = new ConcurrentHashMap(); 
        m.put(100, "Geeks"); 
        m.put(101, "For"); 
        m.put(102, "Geeks"); 
        m.putIfAbsent(101, "Hello"); 
        m.remove(101, "For"); 
        m.putIfAbsent(101, "Hello"); 
        m.replace(101, "Hello", "For"); 
        System.out.println(m); 
    } 
} 