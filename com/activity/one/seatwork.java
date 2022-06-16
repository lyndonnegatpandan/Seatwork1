package com.activity.one;
import com.activity.one.util.ClassC;

public class seatwork{

	public static void display(){
		ClassA a = new ClassA();
		String resultA = a.sample == true ? "True" : "False";
		System.out.println(resultA);
	}

	public static void displayClassB(){
		ClassB b = new ClassB();
		int size = b.days.length;
		for(int i=0; i<size; i++){
			System.out.println(b.days[i]);
		}


	}

	public static int displayClassC(){
		ClassC c = new ClassC();
		int result=5;
		c.setValue(result);
		return result;
	}

	public static void main(String args[]){
		display();
		displayClassB();
		displayClassC();


	}

}