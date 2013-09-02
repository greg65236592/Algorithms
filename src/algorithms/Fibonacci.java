package algorithms;

public class Fibonacci {
	
	//n means the n'st Fibonacci number
	
	public long calculateFn(int n) {
		long fn = 0;

		if(n==0){
			fn = 0;
		}
		
		else if(n==1){
			fn = 1;
		}
		
		if(n<0){
			throw new 
		}
		
		else{
			fn = calculateFn(n - 1) + calculateFn(n - 2);
		}	

		return fn;
	}
}
