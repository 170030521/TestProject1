package com.vm.training.java.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class Producer implements Runnable
{
	BlockingQueue<Integer> CommonQueue;
	 public Producer(BlockingQueue<Integer> CommonQueue)
	 {
		 super();
		 this.CommonQueue = CommonQueue;
	 }
	
public void run()
{
	for(int i=1;i<10;i++)
	{
		System.out.println("PRODUCER :");
		CommonQueue.add(i);
		System.out.println("element add"+i);
		System.out.println("queue elements are"+ CommonQueue);
		System.out.println("+++++++++++");
		
	}
}
}


