/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author penchy
 */
public class QuickSort {
    public QuickSort(int[] toBeSorted) throws UnSortableException
    {
        if(toBeSorted == null)
        {
            throw new UnSortableException();
        }
        else if(toBeSorted.length == 0)
        {
            throw new UnSortableException("The elements of array is 0!");
        }
        else
        {
            this.numbers = toBeSorted;
        }
    }
    
    public int[] sort()
    {
        sortCore(0, numbers.length - 1);
        
        return this.numbers;
    }
    
    private void sortCore(int start, int end)
    {
        //check the stop condition,
        if(end <= start)
        {
            return;
        }
        
        //choose the first element as the piovt
        int piovt = numbers[start];
        int i = start, j = start + 1;
        for( ; j <= end; j++)
        {
            if(piovt >= numbers[j])
            {
                i++;
                if(i != j)
                {
                    numbers[i] += numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] = numbers[i] - numbers[j];
                }
            }
        }
        if(start != i)
        {
            numbers[start] += numbers[i];
            numbers[i] = numbers[start] - numbers[i];
            numbers[start] = numbers[start] - numbers[i];
        }
        
        sortCore(start, i - 1);
        sortCore(i + 1, end);
    }
    
    private int[] numbers = null;
}
