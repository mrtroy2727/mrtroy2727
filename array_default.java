package first_prog;
import java.util.Random;

public class array_default {
	public static void main(String[] args) {
		/*int[] array; // declare array named array
		array = new int[10]; // create array object 
		System.out.printf("%s%8s\n", "Index", "Value");
		Random randomNumbers = new Random();
		
		for(int counter=0; counter<array.length;counter++) {
			array[counter] = counter*counter;  
			System.out.printf("%d", 1+randomNumbers.nextInt(6));
			System.out.printf("%5d%8d\n", counter, array[counter]);
		}*/
		//rollDie();
		survey();
	}
	
	public static void rollDie() {
		Random randomNumbers = new Random();// Random number generator
		int[] frequency = new int[7];// array of frequency counters
		
		for(int roll=1; roll<=6000000; roll++)
			++frequency[1+randomNumbers.nextInt(6)];
		
		System.out.printf("%s%10s\n","Face", "Frequency");
		
		for(int face=1; face<frequency.length;face++)
			System.out.printf("%4d%10d\n", face, frequency[face]);
		
	}
	
	public static void survey() {
		int[] responses = {1, 2, 5, 5, 4, 3, 2, 1, 4, 3, 14, 4, 1, 1, 4, 2, 2, 5, 4, 4, 3, 1, 20};
		int[] frequency = new int[6];//array of frequency counters
		// for each answer, select responses element and use that value
		// as frequency index to determine element to increment
		for(int answer=0; answer < responses.length; answer++){
			try {
				++frequency[responses[answer]];
			}//end try
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf("  responses[%d] = %d\n\n", answer, responses[answer]);
			}// end catch
		}//end for
		System.out.printf("%s%10s\n", "Rating", "Frequency");
		for(int rating = 1; rating< frequency.length; rating++) {
			System.out.printf("%6d%10d : ", rating, frequency[rating]);
			//System.out.printf("%5s", "")
			for(int asteriks=1; asteriks<= frequency[rating]; asteriks++) {
				System.out.print("*");
				}//end for
			System.out.print("\n");
			}//end for
			
			
	}//end survey
}
