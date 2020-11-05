package com.test.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.test.executor.excetion.ProjectContainerException;

public class PCServer {

	AlarmService alarmService = new AlarmService(); 
	
	//ExecutorService executorService = new ExtendedExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());

	
	ExecutorService executorServiceMaster = Executors.newFixedThreadPool(1);
	boolean errorFlag;
	
	public static void main(String[] args) {
		
		PCServer pcServer = new PCServer();
		
		pcServer.suppress(Arrays.asList(1,2,3,4,5));
	}
	
	private void suppress(List<Integer> compIds)
	{
		try {
			alarmService.suppress(compIds);
		} catch (ProjectContainerException e) {
			e.printStackTrace();
			errorFlag = true;
		}
		
		if(errorFlag)
		{
			Runnable runnable = () -> {
				 System.out.println("inside runnable1... = " + compIds );
				 ExecutorService executorService = Executors.newFixedThreadPool(1);
				Callable<String> callableTask = createCallableTask(compIds);
	            System.out.println("Inside : " + Thread.currentThread().getName());
	            moveToExecutor(callableTask, executorService);
	            System.out.println("Thread Finished!!");
	            executorService.shutdown();
	        };

	        executorServiceMaster.submit(runnable);
	        
	        Runnable runnable2 = () -> {
				List<Integer> comIdLocal = compIds;
				//comIdLocal.add(10);
				 System.out.println("inside runnable2... = " + comIdLocal );
				 alarmService.setCounter(0);
				 ExecutorService executorService = Executors.newFixedThreadPool(1);
				Callable<String> callableTask = createCallableTask(comIdLocal);
	            System.out.println("Inside : " + Thread.currentThread().getName());
	            moveToExecutor(callableTask, executorService);
	            System.out.println("Thread Finished!!");
	            executorService.shutdown();
	        };
	        
	        Future<String> futureObj = (Future<String>) executorServiceMaster.submit(runnable2);
	        try {
				futureObj.get(50, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        try {
				futureObj.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("futrue timed out");
//	        Thread thread = new Thread(runnable);
//
//	        System.out.println("Starting Thread...");
//	        thread.start();
			System.out.println("in ErrorFlag");
			
			executorServiceMaster.shutdown();
		}
	}
	
	private void moveToExecutor(Callable<String> callableTask, ExecutorService executorService)
	{
		Callable<String> callable = callableTask;
		boolean error = false;
		System.out.println("Inside : moveToExecutor " );
		Future<String> submit = executorService.submit(callable);
		try {
			String string = submit.get();
		} catch (InterruptedException e) {
			System.out.println("in interrupted exception !!");
			e.printStackTrace();
		} catch (ExecutionException e) {
			Throwable cause = e.getCause();
			System.out.println("cause class--> " +cause.getClass());
			
			System.out.println("in execution Exception");
			if(cause.getClass().equals(com.test.executor.excetion.ProjectContainerException.class))
				error= true;
			e.printStackTrace();
		}
		if(error)
		{
			moveToExecutor(callable, executorService);
		}
		
		
		
	}

	private Callable<String> createCallableTask(List<Integer> compIds) {
		return () -> {
			TimeUnit.MILLISECONDS.sleep(1500);
			alarmService.suppress(compIds);
		    return "Task's execution";
		};
	}

}
