package com.test.executor;

import java.util.List;

import com.test.executor.excetion.ProjectContainerException;

public class AlarmService {

	int counter =0;
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public void suppress(List<Integer> compIds) throws ProjectContainerException
	{
		if(counter<=5)
		{
			System.out.println("error and counter == " + counter);
			counter ++;
			throw new ProjectContainerException();
		}
		
		
	}
}
