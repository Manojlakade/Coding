import java.util.*;
public class basicsorts{
    public static void  bubblesort(int arr[]){
        //turns  
        for(int turns=0;turns<=arr.length-2;turns++)//for(int turns=0;turns<n-1;turns++)
        {
            int swapsss=0;
            //no. of swappings
            for(int swap=0;swap<=arr.length-2-turns;swap++)//for(int swap=0;swap<n-1-turns;swap++)
            {
                if (arr[swap]>arr[swap+1])
                {
                    int temp=arr[swap];
                    arr[swap]=arr[swap+1];
                    arr[swap+1]=temp;
                    swapsss++;
                }
                if (swapsss==0)
                {
                    System.out.println("0000");
                    break;
                    
                }
            }

        }

     
    }
    public static void selectionsort(int arr[])
    {
        for (int turn=0;turn<=arr.length-2;turn++)
        {
            int minvalueindex=turn;
            for(int j=turn+1;j<=arr.length-1;j++)
            {
                if(arr[minvalueindex]>arr[j])
                {
                    minvalueindex=j;

                }
                
            }
            int temp=arr[minvalueindex];
            arr[minvalueindex]=arr[turn];
            arr[turn]=temp;

        }
    }

    public static void insertionsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous]>current)
            {
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;

        }
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String ARGS[]){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);

    }
}