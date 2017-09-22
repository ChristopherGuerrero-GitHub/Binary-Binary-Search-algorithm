package binary;

/**
 *
 * @author Christopher
 */
public class Binary {

    public static void main(String[] args) {
        
        /*
            This program uses a binary search algorithm to sort a unsorted
            array of integers.
        */
        int [] numbers = { 67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        
        binarySearch(numbers, 0, numbers.length, 30); //number will be found
        binarySearch(numbers, 0, numbers.length, 31); //number will NOT be found
        
    }
    
    public static void binarySearch(int [] array, int lowerBound, int upperBound,
            int key){
        
        int position;
        //Find the subscript in the middle.
        position = (lowerBound + upperBound)/2;
        
        //Loop through array to find a match with the key value
        while((array [position] != key) && (lowerBound <= upperBound)){
            //update the upperBound or lowerBound index depending upon the
            //comparison with the key value.
            if(array[position] > key){
                upperBound = position - 1;
            }
            else{
                lowerBound = position +1;
            }
            //recalculate the position index
            position = (lowerBound + upperBound)/2;
                      
        }
        //Print out appropriate message depending if value key was found in array
        if(lowerBound <= upperBound){
            System.out.println("The number was found in array at position: " +
                    position);
        }
        else
        {
            System.out.println("The number was NOT found in the array");
        }
        
        
    }
}
