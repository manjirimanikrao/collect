package pkg;


	import java.util.concurrent.Callable;
	import java.util.concurrent.ExecutionException;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;
	import java.util.concurrent.TimeUnit;
	public class CachedThread {
	    public static void main(String... args) throws InterruptedException, ExecutionException{
	    
	        ExecutorService exService = Executors.newCachedThreadPool();
	      
	        exService.execute(new CachedThread().new RunnableThread());
	 
	        Future<Integer> future=exService.submit(new CachedThread().new CallableThread());
	 
	        int val=future.get();
	        System.out.println(val);
	  
	        boolean isTerminated=exService.isTerminated();
	        System.out.println(isTerminated);
	      
	        exService.awaitTermination(30,TimeUnit.SECONDS);
	        exService.shutdownNow();
	    }
	 
	    class CallableThread implements Callable<Integer> {
	  
	        public Integer call() {
	            int cnt = 0;
	            for (; cnt < 5; cnt++) {
	                System.out.println("call:" + cnt);
	            }
	            return cnt;
	        }
	    }
	    class RunnableThread implements Runnable {
	   
	        public void run() {
	            int cnt = 0;
	            for (; cnt < 5; cnt++) {
	                System.out.println("run:" + cnt);
	            }
	        }
	    }
	 }