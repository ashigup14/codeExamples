package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	private List<List<Integer>> mHistoryMenuList = new ArrayList<>();

	public static void main(String args[])
	{
		ArrayListTest arTest = new ArrayListTest();
		arTest.getHistoryListSize();
		 
	}
	
	private void getHistoryListSize()
	{
		Integer tempItem = 10;
		if(mHistoryMenuList.size()>=0) 
        {
			if(!mHistoryMenuList.isEmpty())
               mHistoryMenuList.get(Math.max(0,0)).add(tempItem);
            else
            {
                mHistoryMenuList.add(new ArrayList<Integer>());
                mHistoryMenuList.get(0).add(tempItem);
            }
        }
	}
	
}
