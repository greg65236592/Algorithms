package algorithms;

import exceptions.NOutOfBoundException;

public class Fibonacci {
	
	//n means the n'st Fibonacci number
	
	public long calculateFn(int n) throws NOutOfBoundException {
		long fn = 0;

		if(n==0){
			fn = 0;
		}
		
		else if(n==1){
			fn = 1;
		}
		
		else if(n<0){
			throw new NOutOfBoundException("The input of calculateFn(int n) in Fabonacci is out of bound!");
		}
		
		else{
			fn = calculateFn(n - 1) + calculateFn(n - 2);
		}	

		return fn;
	}
}
