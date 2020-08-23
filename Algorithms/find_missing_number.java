/*
You are given a list of n-1 integers and these integers are in the range of 1 to n. 
There are no duplicates in the list. One of the integers is missing in the list. 
Write an efficient code to find the missing integer.

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4
*/

/*
Method 1: This method uses the technique of summation formula.

Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers, it will be the value of the missing element.
Algorithm:
1.Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
2.create a variable sum to store the sum of array elements.
3.Traverse the array from start to end.
4.Update the value of sum as sum = sum + array[i]
5.print the missing number as sumtotal – sum

*/


package Algorithms;

public class find_missing_number {
    public static void main(String[] args){
        int total;
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1; //Inlcuding the missing element
         total = (n)*(n+1)/2;
       for(int i=0; i<n-1; i++){
           total=total-arr[i];
       }
      System.out.println(total);   
    }
}