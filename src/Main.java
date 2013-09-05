import java.util.ArrayList;
import java.util.List;

import exceptions.NOutOfBoundException;
import algorithms.BigNumber;
import algorithms.Fibonacci;


public class Main {
	
	public static void  main(String[] args){
		testBigNumber();
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
		List<Integer> a = new ArrayList<Integer>();	
		List<Integer> b = new ArrayList<Integer>();	
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(8);
		a.add(2);

		b.add(9);
		b.add(2);
		b.add(1);
		b.add(5);
		b.add(1);
		BigNumber bigNum = new BigNumber();
		System.out.println(bigNum.BigNumberMultiple(a, b));
	}

}
