
public class PracticeWithLoops {
	/*
	 * Write a function to print out N lines of stars, each line holds M stars
	 * For example if N=10, M =5, then we will have 10 lines of 5 stars
	 */
    public static void printStars(int N, int M) {
    	int i = 1;
    	while (i<=N) {
    	    //for (int i =1;i<=N; i++) {
			for (int j =1; j<=M; j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
    }
	public static void main(String[] args) {
		/*
		 * Write a program to produce the following shape:
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 *  ^^^^^^
		 */
		/*for (int i =1;i<=12; i++) {
			for (int j =1; j<=6; j++) {
				System.out.print("^");
			}
			System.out.println();
		} */
		//printStars(2, 14);
		for (int i =1;i<=10; i++) {	 //i here is a block variable
		}
		int i = 1;  // i here is a a local variable 
		for (;i<=10;i++) {}
		// block variables: are only alive (defined) inside the loop. Once we exit the block
		// the variable is deleted from memory
		//what is a block, any piece of code defined in { } or a compound statement like for loop
		
		{
			int j =1;
			int z=20;
			System.out.println("inside the block: z = "+z+ " j ="+j);
		}
		int j =10;
		int z=200;
		System.out.println("outside the block (local variables): z = "+z+ " j ="+j);
	}
		// Instance variables, class variables (static): all the class
	    // Functions Parameters: all the function in which they are defined
	    // local variables: from their definition, to the end of the function
	    // block variables: only inside the block in which they are defined
	    
	

}
