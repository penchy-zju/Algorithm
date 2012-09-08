/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author penchy
 */
public class Insertion {
    public Insertion(int[] toBeSorted) throws UnSortableException
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
    
    //this is the sort function
    public int[] sort() throws UnSortableException
    {
        for(int i = 1; i < numbers.length; i++)
        {
            int theOne = numbers[i];
            int position = i;
            
            for(int j = i - 1; j >= 0; j--)
            {
                if(theOne < numbers[j])
                {
                    //move the number[j] to number[j + 1] 
                    numbers[j + 1] += numbers[j];
                    numbers[j] = numbers[j + 1] - numbers[j];
                    numbers[j + 1] = numbers[j + 1] - numbers[j];
                    
                    position--;
                }
                else
                {
                    break;
                }
            }
            
            numbers[position] = theOne;
        }
        
        return this.numbers;
    }
    
    //array to be sorted
    private int[] numbers = null;
}
