package com.test.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java program to find equilibrium
//index of an array

class EquilibriumIndex {
	
 private List<Integer> equilibrium(int arr[], int n)
 {
	 List<Integer> equilibriumIndexes =  new ArrayList<>();
     int sum = 0; // initialize sum of whole array
     int leftsum = 0; // initialize leftsum

      
  //    sum = Arrays.asList(arr).stream().reduce(Integer::sum).get();
     /* Find sum of the whole array */
//     for (int i = 0; i < n; ++i)
//         sum += arr[i];

      sum = Arrays.stream(arr).boxed().reduce(Integer::sum).get();
      System.out.println("sum =" + sum);
      
      
     for (int i = 0; i < n; ++i) {
         sum -= arr[i]; // sum is now right sum for index i

         if (leftsum == sum)
        	 equilibriumIndexes.add(i);

         leftsum += arr[i];
     }

     /* If no equilibrium index found, then return 0 */
     return equilibriumIndexes;
 }

// Driver code
 public static void main(String[] args)
 {
     EquilibriumIndex equi = new EquilibriumIndex();
     int[] arr = { -7, 1, 5, 2, -4, 3, 0, 4 ,-8, 6 ,-2};
     int arr_size = arr.length;
     System.out.println("Equilibrium indexes = " +
                       equi.equilibrium(arr, arr_size));
 }
}
