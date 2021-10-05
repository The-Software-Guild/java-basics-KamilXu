package JavaBasics;
/*
    Name: Kamil Xu 
*/

public class SummativeSums {
    public static void main(String[] args) {
        //define your arrays
        int array1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int array2[] = { 999, -60, -77, 14, 160, 301 };
        int array3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
      
        //print out message and run array through summing function
        System.out.println("#1 Array Sum:   " + sum(array1));
        System.out.println("#2 Array Sum:   " + sum(array2));
        System.out.println("#3 Array Sum:   " + sum(array3));
    
    }

    //function to sum the arrays
    private static int sum(int[] currentArray) {
        int total = 0;
        //iterates through each value in the array and adds it into the variable total then returns it, got to love java for this
        for(int i : currentArray){
            total+=i;
        }
        return total;
    }
}
