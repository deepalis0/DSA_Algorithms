public class QuickSort
{

     public static void main(String args[]) {

          int[] a = new int[]{4,1,3,9,7};  // {11,12,10,13,14};
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

     static void swap(int[] arr, int i, int j)
     {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }

     static int partition(int[] a,int low,int high)
     {

          int pivot = a[low];
          int i=low,j=high;
          while(i<j)
          {
               while(i<a.length && a[i]<=pivot)
               {
                    i++;
               }
               while(j>=0 && a[j]>pivot)
               {
                    j--;
               }

               if(i<j)//re-arranging the array
               {
                    swap(a,i,j);
               }
          }
          swap(a,low,j);//putting pivot element in correct position
          return j;

     }


     static void quickSort(int[] a, int low,int high)
     {
          if(low<high)
          {
               int partitionIndex = partition(a, low, high);//3
               quickSort(a, low, partitionIndex - 1);
               quickSort(a, partitionIndex + 1, high);
          }

     }

}

