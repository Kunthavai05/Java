package com.opps.poly;

public class Task {
	
    public static int solution(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int product = arr[i] * arr[i + 1];
            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int result = solution(inputArray);
        System.out.println("The largest product of adjacent elements is: " + result);
    }

}
