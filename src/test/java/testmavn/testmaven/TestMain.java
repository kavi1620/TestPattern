package testmavn.testmaven;

public class TestMain {
	

	public static void main(String[] args) {

		methodPatter(10);
	}
	
	public static void methodPatter(int rows) {
		try {
		//added I++ and it took me to the infinite loop without throwing any error, assumed that on incrementing
		//the i value i can get into the j loop
			for (int i=rows; i >= 1; i--)
	        {
	          for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            } 
	          //when j=10 it comes out of the above loop and enters this loop
	          for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j+ " ");
	            }  
	            System.out.println();
	        }
	
		}
		catch(Exception e) {
			
			System.out.println(e+"The triangle pattern is not printed");
		}
	}
	

}
