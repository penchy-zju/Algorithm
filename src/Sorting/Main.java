/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author penchy
 */
public class Main {
    public static void main(String[] args) throws UnSortableException
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] toBeSorted = new int[num];
        
        for(int i = 0; i < num; i++)
        {
            toBeSorted[i] = scanner.nextInt();
        }
        
        //insertion sort
        Insertion insertion = new Insertion(toBeSorted);
        int[] sorted = insertion.sort();
        
        for(int i = 0; i < sorted.length; i++)
        {
            System.out.println(sorted[i]);
        }
    }
}