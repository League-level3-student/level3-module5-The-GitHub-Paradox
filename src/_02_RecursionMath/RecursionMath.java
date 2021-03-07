package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        if(times == 1) {
        	return(number);
        }
        else {
        	return(number + recursiveMultiplication(number, times-1));
        }
    	// If times is 1 
            // Return number 

        // Else return number + recursionMultiplication(number, times-1)

    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDevideBy) {
        if(numberToDevideBy < number) {
        	return(number/numberToDevideBy);
        }
        else{
        return 0;
        }
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        return(number^power);
    }
}
