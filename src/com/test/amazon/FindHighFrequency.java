// Given web-server log files in the format
// (Timestamp, CustomerID, PageID)
// Find the most frequent page transitions
// Example:
//
//Input
// 1, David, Login
// 2, David, Account
// 3, Jane, Search
// 4, David, Main
// 5, Jane, Results
// 6, David, Search
// 7, David, Results
// 8, 
//
//Output:
// Search -> Results

// You can assume this class and accessors exists
// class LogRecord:
//     timestamp: int
//     customer_id: str
//     page_id: str
//
// def findMostFrequent(inputRecords):

package com.test.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindHighFrequency {

	private static String findMostFrequent(List<LogRecord> logRecords) {
		if (logRecords != null && logRecords.size() > 0) {
			Map<String, String> custRecords = new HashMap<>();
			Map<String, Integer> frequency = new HashMap<>();

			// logfill
			for (LogRecord record : logRecords) {
				// checking if the custRecords contains the customer data
				String page_id = record.getPage_id();
				String customer_id = record.getCustomer_id();

				if (custRecords.containsKey(customer_id)) {
					String previousPage = custRecords.get(customer_id);
					
					// this line is the improvement i see... line 52 replaces the if else in line 56 - 60 
					frequency.merge(previousPage + " -> " + page_id, 1, Integer::sum);
					
					// done in actual implementation 
					/*if (frequency.containsKey(previousPage + "#" + page_id)) {
						frequency.put(previousPage + "#" + page_id, frequency.get(previousPage + "#" + page_id) + 1);
					}
					else
						frequency.put(previousPage + "->" + page_id, 1);*/
					
					custRecords.put(customer_id, page_id);
				} else {
					custRecords.put(customer_id, page_id);
				}
			}

			Entry<String, Integer> entry = frequency.entrySet().stream()
									   .max((ent1, ent2) -> ent1.getValue() > ent2.getValue() ? 1 : -1)
									   .get();
			return entry.getKey();
		}
		return "";
	}

	public static void main(String[] args) {
		List<LogRecord> logRecords = new ArrayList<>();
		logRecords = Arrays.asList(new LogRecord(1, "David", "Login"), 
				new LogRecord(1, "David", "Account"),
				new LogRecord(2, "Jane", "Search"), 
				new LogRecord(3, "David", "Main"),
				new LogRecord(4, "Jane", "Results"), 
				new LogRecord(5, "David", "Search"),
				new LogRecord(6, "David", "Results"),
				new LogRecord(7, "David", "Main"),
				new LogRecord(8, "David", "Search"),
				new LogRecord(9, "Adam", "Main"),
				new LogRecord(10, "Adam", "Search"));
		System.out.println(findMostFrequent(logRecords));

	}

}

class LogRecord {
	int timestamp;
	String customer_id;
	String page_id;

	public LogRecord(int timestamp, String customer_id, String page_id) {
		this.timestamp = timestamp;
		this.customer_id = customer_id;
		this.page_id = page_id;
	}

	/**
	 * @return the timestamp
	 */
	public int getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the customer_id
	 */
	public String getCustomer_id() {
		return customer_id;
	}

	/**
	 * @return the page_id
	 */
	public String getPage_id() {
		return page_id;
	}

	// getters in class for all the fields
}
