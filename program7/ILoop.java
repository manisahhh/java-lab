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
