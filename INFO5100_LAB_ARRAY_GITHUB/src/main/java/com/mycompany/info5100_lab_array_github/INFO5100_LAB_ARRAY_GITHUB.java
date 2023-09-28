/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.info5100_lab_array_github;

import java.util.Scanner;

/**
 *
 * @author emmanuelchibua
 */
public class INFO5100_LAB_ARRAY_GITHUB {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        
        // Array capable of holding 'n' integers
        int[] arr = new int[n];
        
        // Read 'n' integers and save them in the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print each element of the array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        scanner.close();
    }
}
