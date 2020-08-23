package Algorithms;

/*
Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. 
Find the smallest number that is missing from the array.

Examples
Input: {0, 1, 2, 6, 9}, n = 5, m = 10
Output: 3

Input: {4, 5, 10, 11}, n = 4, m = 12
Output: 0

Input: {0, 1, 2, 3}, n = 4, m = 5
Output: 4

Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
Output: 8

*/

/*
Method 1 (Use Binary Search)
For i = 0 to m-1, do binary search for i in the array. If i is not present in the array then return i.

Time Complexity: O(m log n)

Method 2 (Linear Search)
If arr[0] is not 0, return 0. Otherwise traverse the input array starting from index 0, and for each pair of elements a[i] and a[i+1], find the difference between them. if the difference is greater than 1 then a[i]+1 is the missing number.

Time Complexity: O(n)
*/


public class smallest_missing_number {

    public static int binarySearch(int[] arr, int low, int high, int key ) {
        if(high >= low){
            int mid = low+high/2;
            if(arr[mid] == key){
                return mid;
            }else if(key<arr[mid]){
                return binarySearch(arr, low, mid-1, key);
            }else if(key>arr[mid]){
                return binarySearch(arr, mid+1, high, key);
            }
        } 
            return -1;
    }

   private static int smallestMissingNumber(int[]arr, int m){
       for(int i=0;i<m;i++){
           int missing = binarySearch(arr, 0, m-1, arr[i]);
           if(missing == -1){
               return arr[i];
           }
       }
       return -1;
   }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int smallestMissingNo;
        // if(arr[0]!= 0){
        //     smallestMissingNo=0;
        // }
        smallestMissingNo = smallestMissingNumber(arr, arr.length); 

      System.out.println(smallestMissingNo);   
    }
}