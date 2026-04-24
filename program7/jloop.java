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
