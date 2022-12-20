import javax.swing.*;
// https://github.com/deepalis0/DSA_Algorithms/tree/main
public class sorting
{

     public static void main(String args[]) {

          int[] a = new int[]{4,1,3,9,7}; //{10, 80, 30, 90, 40, 50, 70}; // {10,9,8};
          quickSort(a,0,a.length-1);
          System.out.println("Sorted array: ");
          printArray(a);
     }
     static void printArray(int[] arr)
     {
          for(int i = 0; i < arr.length; i++)
               System.out.print(arr[i] + " ");

          System.out.println();
     }

     static int partition(int[] a,int low,int high)
     {
          int i = low;
          int j = high;
          int pivot = a[low];
          while(i<j)
          {
               while(i<a.length && pivot>=a[i])
               {
                    i++;
               }
               while(j>=0 && pivot<a[j])
               {
                    j--;
               }
               if(i<j)
               {
                   swap(a,i,j);
               }
          }
          swap(a,low,j);
          return j;
     }

     static void swap(int[] arr, int i, int j)
     {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }


     static void quickSort(int[] a, int low,int high)
     {
          if(low<high)
          {
               int p = partition(a,low,high);
               quickSort(a,low,p-1);
               quickSort(a,p+1,high);
          }
     }

}

