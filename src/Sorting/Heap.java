/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author penchy
 */
public class Heap {
    public Heap(int[] input) throws Exception
    {
        if(input == null || input.length == 0)
        {
            throw new Exception("The input array is empty!");
        }
        
        this.heapArray = input;
        this.heapSize = input.length;
    }
 
    /***************** Maximun Heap Operation *****************************/
    
    //keep the maximun heap property
    private void maxHeapify(int i, int[] heapArray, int heapSize)
    {
        int largest = i;
        if(left(i) < heapSize)
        {
            if(heapArray[left(i)] > heapArray[largest])
            {
                largest = left(i);
            }
        }
        if(right(i) < heapSize)
        {
            if(heapArray[right(i)] > heapArray[largest])
            {
                largest = right(i);
            }
        }
        if(largest != i)
        {
            int temp = heapArray[i];
            heapArray[i] = heapArray[largest];
            heapArray[largest] = temp;
            
            maxHeapify(largest, heapArray, heapSize);
        }
    }
    
    //build maxinmun heap
    public void maxHeapBuild()
    {
        for(int i = ((int)(Math.floor(heapSize / 2)) - 1); i >= 0; i--)
        {
            maxHeapify(i, heapArray, heapSize);
        }
    }
    
    /*
     * 也可以用过插入法建堆，如果要建最大堆，首先插入一个新元素放在最后，
     * 然后与父节点比较，如果大于父节点就交换，然后递归，知道其不大于父节点。
    */
    
    //heapsort with biggest last
    public int[] heapSortLarger()
    {
        int[] sorted = (int[])heapArray.clone();
        int size = heapSize;
        
        while(size-- > 0)
        {
            int temp = sorted[0];
            sorted[0] = sorted[size];
            sorted[size] = temp;
            
            maxHeapify(0, sorted, size);
        }
        
        return sorted;
    }
    
    /*****************End of Maximun Heap Operation ************************/
    
    /***************** Minimun Heap Operation *****************************/
    
    //keep the minimun heap property
    private void minHeapify(int i, int[] heapArray, int heapSize)
    {
        int minimun = i;
        
        if(left(i) < heapSize)
        {
            if(heapArray[left(i)] < heapArray[minimun])
            {
                minimun = left(i);
            }
        }
        
        if(right(i) < heapSize)
        {
            if(heapArray[right(i)] < heapArray[minimun])
            {
                minimun = right(i);
            }
        }
        
        if(minimun != i)
        {
            int temp = heapArray[i];
            heapArray[i] = heapArray[minimun];
            heapArray[minimun] = temp;
            
            minHeapify(minimun, heapArray, heapSize);
        }
    }
    
    //build maxinmun heap
    public void minHeapBuild()
    {
        for(int i = ((int)(Math.floor(heapSize / 2)) - 1); i >= 0; i--)
        {
            minHeapify(i, heapArray, heapSize);
        }
    }
    
    //heapsort with biggest last
    public int[] heapSortSmaller()
    {
        int[] sorted = (int[])heapArray.clone();
        int size = heapSize;
        
        while(size-- > 0)
        {
            int temp = sorted[0];
            sorted[0] = sorted[size];
            sorted[size] = temp;
            
            minHeapify(0, sorted, size);
        }
        
        return sorted;
    }
    
    /*****************End of Minimun Heap Operation ************************/
    
    //given node i, the way to get i's parent, left child and right child
    private int parent(int i)
    {
        return (int) (Math.floor((i + 1) / 2) - 1);
    }
    private int left(int i)
    {
        return (2 * i + 1);
    }
    private int right(int i)
    {
        return (2 * i + 2);
    }
    //heap data, elements from floor(size/2) to n are leaves
    private int[] heapArray = null;
    private int heapSize = 0;
}
