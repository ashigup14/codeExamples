package com.test.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	final Node head = new Node();
	final Node tail = new Node();
	
	Map<Integer, Node> node_map;
	int cache_capacity;
	
	
	public LRUCache(int capacity) {
		node_map = new HashMap<Integer, Node>(capacity);
		cache_capacity = capacity;
		head.setNext(tail);
		tail.setPrev(head);
	}

	
	public void add(Node node)
	{
		Node head_next = head.getNext();
		node.setNext(head_next);
		node.setPrev(head);
		head.setNext(node);
		head_next.setPrev(node);		
	}
	
	public void remove(Node node)
	{
		Node node_next = node.getNext();
		Node node_prev = node.getPrev();
		node_prev.setNext(node_next);
		node_next.setPrev(node_prev);
		node = null;
	}
	
	public void put(int key, int value)
	{
		Node node = node_map.get(key);
		
		if(node != null)
		{
			remove(node);
			node.setVal(value);
			add(node);
		}
		else
		{
			if(node_map.size() == cache_capacity)
			{
				node_map.remove(tail.getPrev().getKey());
				remove(tail.getPrev());
			}
			
			Node new_node = new Node(key, value);
			node_map.put(key, new_node);
			add(new_node);
		}
	}
	
	
	public int get(int key)
	{
		int result = -1;
		Node node = node_map.get(key);
		
		if(node != null)
		{
			result = node.getVal();
			remove(node);
			add(node);
		}
		return result;
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
	}

}
