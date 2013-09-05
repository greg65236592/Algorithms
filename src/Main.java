import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exceptions.NOutOfBoundException;
import algorithms.BigNumber;
import algorithms.Fibonacci;


public class Main {
	
	public static void  main(String[] args){
		Calendar startTime = Calendar.getInstance();
		testBigNumber();
		Calendar endtTime = Calendar.getInstance();
		System.out.println("Time spend: " + endtTime.compareTo(startTime));
	}
	
	public static void testFabonacci(){
		//Fibonacci Number
		Fibonacci fib = new Fibonacci();
		for(int i = 0; i < 21; i++){
			try {
				System.out.println("The " + i+"'st Fibonacci Number is: "
						+ fib.calculateFn(i));
			} catch (NOutOfBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Please reset the i of calculateFn(i)");
			}
		}
	}
	
	public static void testBigNumber(){
		BigNumber bigNum = new BigNumber();
		System.out.println(bigNum.BigNumberMultiple("25987498173019853036501", "6781987301953701358"));
	}
	

}
