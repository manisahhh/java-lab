// ILoop: Prints 1 to 50 with a '/' symbol 
class ILoop implements Runnable { 
@Override 
public void run() { 
for (int i = 1; i <= 50; i++) { 
System.out.println("ILoop (/): " + i); 
try { 
// Short sleep to allow the other thread to take turns 
Thread.sleep(50);  
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
} 
// JLoop: Prints 1 to 50 with a '\' symbol 
class JLoop implements Runnable { 
@Override 
public void run() { 
for (int i = 1; i <= 50; i++) { 
System.out.println("JLoop (\\): " + i); 
try { 
Thread.sleep(50); 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
} 
public class CountThreads { 
public static void main(String[] args) { 
System.out.println("--- Starting Concurrent Count ---\n"); 
Thread t1 = new Thread(new ILoop()); 
Thread t2 = new Thread(new JLoop()); 
t1.start(); 
t2.start(); 
try { 
t1.join(); 
t2.join(); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
System.out.println("\n--- Both threads finished counting! ---"); 
} 
}
