// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
<<<<<<< HEAD

class MinMaxExample { 
 
  public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
 
    // Calling getMax() method for getting max value
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}

=======
public static void main(String[] args){
		int[] arrayIn = {56,9,21,78,91,64,84,53,25};
		Arrays.sort(arrayIn);
		int min = arrayIn[0];
		int max = arrayIn[arrayIn.length-1];
                
                int[] minA = new int[1];
                int[] maxA = new int[1];
                
                for(int i = 0; i <= arrayIn.length - 1; i++){
                    if (arrayIn[i] <= max){
                        maxA[0] = arrayIn[i];
                    }
                    if (arrayIn[i] <= min){
                        minA[0] = arrayIn[i];
                    }
                }
                System.out.println(Arrays.toString(arrayIn));
                System.out.println("Max integer is " + Arrays.toString(maxA));
                System.out.println("Min integer is " + Arrays.toString(minA));
	}
>>>>>>> f2cb726813d99a923abc5e0900986b0c11b362d9
