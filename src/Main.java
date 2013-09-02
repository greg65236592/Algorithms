import algorithms.Fibonacci;


public class Main {
	
	public static void  main(String[] args){
		//Fibonacci Number
		Fibonacci fib = new Fibonacci();
		for(int i = 0; i < 21; i++){
			System.out.println("The " + i+"'st Fibonacci Number is: "
					+ fib.calculateFn(i));
		}
	}

}
