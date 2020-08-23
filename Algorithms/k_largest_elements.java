/*
Given an array of N positive integers, print k largest elements from the array.  The output elements should be printed in decreasing order.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N and k, N is the size of array and K is the largest elements to be returned. The second line of each test case contains N input C[i].

Output:
Print the k largest element in descending order.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100
K ≤ N
1 ≤ C[i] ≤ 1000

Example:
Input:
2
5 2
12 5 787 1 23
7 3
1 23 12 9 30 2 50

Output:
787 23
50 30 23
*/

package Algorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class k_largest_elements {
    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23};
        int n = arr.length;
        int k = 2;

        Queue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList();
  
        for(int i =0;i<n;i++){
            if(queue.size() == k){
                if(queue.peek() < arr[i]) {
                    queue.poll();
                    queue.add(arr[i]);
                }
            } else {
                queue.add(arr[i]);
            }   
        }

        while(!queue.isEmpty()){
            list.add(queue.peek());
            queue.poll();
        }

        for(int j=list.size()-1; j>=0;j--){
            System.out.println(list.get(j));
        }

    }
}