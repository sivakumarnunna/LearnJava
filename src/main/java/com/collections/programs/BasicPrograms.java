package com.collections.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BasicPrograms {
	
	public static void main(String[] args) {
		
		/*
		 * getCountofChar("hamam"); getfirstrepchar("karbc"); getFibo(10);
		 * System.out.println(isBalanced("{}{}[]()"));
		 */
		
		
		System.out.println(reverseInt(1788));
	}
	
	
	// get the count of each character in a given String
	public static void getCountofChar(String string) {
		
	  
		char[] chars = string.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : chars) {
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
	
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"::"+entry.getValue());
			
			
		}
		
		
	}
	
	// get the first repeated character
	public static Character getfirstrepchar(String string) {
		
		char ch = 0 ;
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();

		
		for (char c : string.toCharArray()) {
			
			if(map.containsKey(c)== true) {
				System.out.println(c);
				 return c;
			}
			
			else {
				map.put(c, 1);
			}
			
		}
		System.out.println("No character was repeated");

		return ch;
		
	}
	
	// print the  given number of fibonacci series
	public static List<Integer> getFibo(int number) {
		
	List<Integer> lst = new ArrayList<Integer>();
	
	int n1 =0;
	int n2=1;
	int sum;
	
	lst.add(n1);
	lst.add(n2);
	
	for ( int n =2;n<=number;n++) {
		
		sum = n1+n2;
		lst.add(sum);
		n1=n2;
		n2=sum;
		
	}
		
			
	for( Integer i : lst){
		System.out.println(i);
		
	}
		
		return lst;
		
		
		
	}
	
	//check whether a given string is balanced paranthesis or not
	public static boolean isBalanced(String str) {
		
		Stack<Character> chars = new Stack<Character>();
		
		if(str.charAt(0)==')' || str.charAt(0)=='}' || str.charAt(0)==']'){
			return false;
		}
		
		for ( int i =0;i<str.length();i++) {
			
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
				chars.push(str.charAt(i));
				
			}
			else if( (str.charAt(i)==')' && chars.peek()=='(')  ||
					 (str.charAt(i)=='}' && chars.peek()=='{')   ||
					 (str.charAt(i)==']' && chars.peek()=='[') 
					) {
				
				chars.pop();
				
			}
			
			else {
				chars.push(str.charAt(i));
			}
		}
		
		if(chars.isEmpty()) {
			return true;
		}
		
		return false;
	}

	//reverse given number
    public static int reverseInt(int number) {
    	
    	int reverseint = 0;
    	
    	while(number!=0) {
    		
    		
    		reverseint = number%10;
    		reverseint = reverseint*10+reverseint;
    		number = number/10;

    		
    		
    	}
    	
    	
    	return reverseint;
    }


}
