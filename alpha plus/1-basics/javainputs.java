import java.util.*;
// package College;

public class javainputs {


     
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
 
    // Function to print an array
    static void printArray(int n)
    {
       for(int i=0;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
 
    // Driver program
    public static void main(String args[])
    {
        printArray(5);
        
    }
}
 



    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String input=sc.next();
    //     System.out.println(input);
    // }
    

