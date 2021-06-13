import java.io.IOException;


public class FibWork {


	public static void main(String[] args) throws IOException {

		int i = 0;
		int number = 40;
				;
		int fib1;
		int	fib2;
		int dif = 0;
		int dif2 = 0;
		long start_time,end_time;
		
		
		System.out.print("n\tIterative\tRecursive\n");
		System.out.print("\n");
		
		
		
		
		for(i=1;i<=number;i++) //loop from 20 to 40
		{
			start_time  = System.nanoTime();      //Sets beginning time
			fib1 = FibonacciIterative(i);         //calling function for fib iterative method
			end_time  = System.nanoTime();        //Sets end time
			dif  = (int)((end_time - start_time) / 1e6);      //Time calc
			
			start_time = System.nanoTime();       //Starts beginning time for recursive
			fib2 = FibonacciRecursive(i);         //Call fib recursive method here
			end_time = System.nanoTime();         //Sets end time
			dif2 = (int)((end_time - start_time) / 1e6);        //Time Calc
			
			
			System.out.print(i+"\t\t"+dif+"\t\t"+dif2 +"\t\n"); 
			
		}
		

	}//end main
	
	//Setup fib recursive method
	
	public static int FibonacciRecursive(int n) { 

		if(n<=1)
		{
			return 1;
		}
		else {
			return FibonacciRecursive(n-1)+FibonacciRecursive(n-2);
		}
	}


	//Setup fib iterative method
	
	public static int FibonacciIterative(int n) {         
		
		if(n<=1)
		{
			return 1;
		}
		
		int r=0,p=1,pp=1,i;
		for(i=0;i<=n;i++)
			
		{
			r = p + pp;
			pp =p;
			p =r;
		}
		return r;
		
		
	}//end methods
}//end class