import exceptions.NOutOfBoundException;
import algorithms.Fibonacci;


public class Main {
	
	public static void  main(String[] args){
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

}
