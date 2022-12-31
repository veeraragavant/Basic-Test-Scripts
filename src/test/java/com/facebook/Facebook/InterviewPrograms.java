package com.facebook.Facebook;

import java.util.LinkedHashMap;
import java.util.Map;

public class InterviewPrograms {

	static void reverseastring() {
		
		String a = "Software";
		
		String rev = "";
		
		int length = a.length();
		for (int i = length-1; i>=0; i--) {
			rev= rev+a.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
	static void reverseastring2() {
		
		String a = "Software Engineer";
		String[] split = a.split(" ");
		for (int i=split.length-1; i>=0; i--) {
			System.out.println(split[i]);
		}
	}
	
	static void repeatednumbers() {
		int a[]= {1,3,1,2};
		int length = a.length;
		for (int i = 0; i <=length-1; i++) {
			for (int j = i+1; j <=length-1; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	
	static void repeatedwords() {
		
		String a = "Veera and Dhoni are Crcketers Dhoni";
		String[] split = a.split(" ");
		Map<String, Integer> map= new LinkedHashMap<String, Integer>();
		
		for (String string : split) {
			if (map.containsKey(string)) {
				Integer integer = map.get(string);
				map.put(string, integer+1);
			}

				else {
					map.put(string, 1);
				}
		}
			System.out.println(map);
	}
		
	static void atoz() {
		String a = "";
		for (char i = 'a'; i <='z'; i++) {
			System.out.print(i);
		}
	}
		
	static void removesplchar() {
		String a = "Pr!ogr#am%m*in&g Lan?#guag(e";
		String a1="";
		
		for (int i = 0; i <=a.length()-1; i++) {
			if (a.charAt(i)>64 && a.charAt(i)<123) {
				a1= a1+a.charAt(i);
			}
		}
		System.out.println(a1);
	}
	
	static void fivestars() {
		
		for(int i=0; i<5; i++)   
		{   
		for(int j=0; j<i; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println("*");  
		}
		
	}
	
	static void ffff() {
		int a=0;
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=5; j++) {
				a++;
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println(a);
	}
	
	
	static void gh() {
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=2; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		gh();
	}
}
