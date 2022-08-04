package asp2;

	
	import java.io.*; 
	import java.util.*; 
	class Sender 
	{ 
	    public void send(String msg) 
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1500); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class ThreadedSend extends Thread 
	{ 
	    private String msg; 
	    private Thread t; 
	    Sender  sender; 
	    ThreadedSend(String m,  Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 
	public class Threads 
	{ 
	    public static void main(String args[]) 
	    { 
	        Sender snd = new Sender(); 
	        ThreadedSend S1 = 
	            new ThreadedSend( " Pranav " , snd ); 
	        
	        System.out.println("");
	        ThreadedSend S2 = 
	            new ThreadedSend( " Sharma " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interruption!!!"); 
	        } 
	    } 
	} 


