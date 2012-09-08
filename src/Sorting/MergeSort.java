/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author penchy
 */
public class MergeSort {
    public MergeSort(int[] toBeSorted) throws UnSortableException
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
    
    public int[] sort() throws UnSortableException
    {
        //Here we use another function, this is all because we use the 
        //private numbers[]. In this way, we only trans the numbers[] to
        //sortCore() once. 
        return sortCore(numbers);
    }
    
    private int[] sortCore(int[] toBeSorted) throws UnSortableException
    {
        if(toBeSorted == null)
        {
            throw new UnSortableException();
        }
        else if(toBeSorted.length == 0)
        {
            throw new UnSortableException("The elements of array is 0!");
        }
        else if(toBeSorted.length == 1)
        {
            return toBeSorted;
        }
        else
        {
            int[] left = new int[toBeSorted.length / 2];
            int[] right = new int[toBeSorted.length - toBeSorted.length / 2];
            System.arraycopy(toBeSorted, 0, left, 0, left.length);
            System.arraycopy(toBeSorted, left.length, right, 0, right.length);
            
            return merge(sortCore(left), sortCore(right));
        }
    }
    
    //merge the sorted array
    private int[] merge(int[] left, int right[]) throws UnSortableException
    {
        if(left == null || right == null)
        {
            throw new UnSortableException();
        }
        
        int[] sorted = new int[left.length + right.length];
        int leftTrack = 0, rightTrack = 0, count = 0;
        //key part
        while(leftTrack < left.length && rightTrack < right.length)
        {
            if(left[leftTrack] < right[rightTrack])
            {
                sorted[count++] = left[leftTrack++];
            }
            else if(left[leftTrack] > right[rightTrack])
            {
                sorted[count++] = right[rightTrack++];
            }
            else
            {
                sorted[count++] = left[leftTrack++];
                sorted[count++] = right[rightTrack++];
            }
        }
        
        //combine the left
        for(int i = leftTrack; i < left.length; i++)
        {
            sorted[count++] = left[i];
        }
        for(int i = rightTrack; i < right.length; i++)
        {
            sorted[count++] = right[i];
        }
        
        return sorted;
    }
    
    private int[] numbers = null;
}
