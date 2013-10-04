import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exceptions.NOutOfBoundException;
import algorithms.BigNumber;
import algorithms.BubbleSort;
import algorithms.Fibonacci;


public class Main {
	
	public static void  main(String[] args){

		BubbleSort bs = new BubbleSort();
		List<Integer> input = new ArrayList<Integer>();
		
		input.add(8978791);
		input.add(977);
		input.add(9);
		input.add(59);
		input.add(19);

		System.out.println(bs.performBubbleSort(input));
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
