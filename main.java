import java.util.*;
public class Main
{
    public static void doubleNegatives(int[] numbers){
        
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i]<0)
            numbers[i] = numbers[i] * 2;
            
        }
    }
	public static void main(String[] args) {
	    
	    int [] myArray = {0, 1, -2, -4, -5};
	System.out.println("Original array: " + java.util.Arrays.toString(myArray));
		doubleNegatives(myArray);
	System.out.println("my array: " + Arrays.toString(myArray));
	
	}
}
