import java.util.*;

public class QuickSort
{
  
  void quickSort(int[] arr, int left, int right)
  {
    int index = partition(arr, left, right);
    System.out.println("INDEX: " + index);

    if (left < index - 1) // sort left half
      quickSort(arr, left, index - 1);

    if (index < right) // sort right half
      quickSort(arr, index, right);
  }

  int partition(int[] arr, int left, int right)
  {
    int pivot = arr[(left + right) / 2]; // picks a pivot

    while (left <= right)
    {
      // find elements on left that should be on right of pivot
      while (arr[left] < pivot)
        left++;
      
      // find elements on right that should be on left of pivot
      while (arr[right] > pivot)
        right--;

      // swap element, move indices 
      if (left <= right)
      {
        // swap elements
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

        left++;
        right--;
      }
    }
   
    return left;
  }

  public static void main(String[] args)
  {
    int[] a = {-5, -2, 3, 1, 7, -1};

    QuickSort q = new QuickSort();

    q.quickSort(a, 0, a.length-1);

    System.out.println("Sorted: " + Arrays.toString(a));
  }

}