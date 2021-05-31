package com.vm.training.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer> CommonQueue;
	 public Consumer(BlockingQueue<Integer> CommonQueue)
	 {
		 super();
		 this.CommonQueue = CommonQueue;
	 }
	 public void run()
	 {
	 	while(true)
	 	{
	 		try
	 		{
	 			System.out.println("CONSUMER :");
	 			System.out.println("consumer is taking" + CommonQueue.take());
	 			System.out.println("++++++");
	 		}
	 		catch(InterruptedException e)
	 		{
	 			e.printStackTrace();
	 		}
	 	}

	 }
}


